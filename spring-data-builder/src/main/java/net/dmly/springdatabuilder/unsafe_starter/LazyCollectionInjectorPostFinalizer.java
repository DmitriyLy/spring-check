package net.dmly.springdatabuilder.unsafe_starter;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
public class LazyCollectionInjectorPostFinalizer implements PostFinalizer {

    private final ConfigurableApplicationContext realContext;

    @SneakyThrows
    @Override
    public Object postFinalize(Object retVal) {
        if (Collection.class.isAssignableFrom(retVal.getClass())) {
            List models = (List) retVal;

            for (Object model : models) {

                Field idField = model.getClass().getDeclaredField("id");
                idField.setAccessible(true);
                Long ownerId = idField.getLong(model);

                Field[] fields = model.getClass().getDeclaredFields();
                for (Field field : fields) {
                    if (List.class.isAssignableFrom(field.getType())) {
                        String columnName = field.getAnnotation(ForeignKey.class).value();
                        Class<?> embeddedModelClass = getEmbeddedModel(field);
                        String pathToData = embeddedModelClass.getAnnotation(Source.class).value();

                        LazySparkList lazySparkList = realContext.getBean(LazySparkList.class);
                        lazySparkList.setOwnerId(ownerId);
                        lazySparkList.setModelClass(embeddedModelClass);
                        lazySparkList.setForeignKeyName(columnName);
                        lazySparkList.setModelClass(embeddedModelClass);
                        lazySparkList.setPathToSource(pathToData);

                        field.setAccessible(true);
                        field.set(model, lazySparkList);
                    }
                }
            }
        }
        return retVal;
    }

    private Class<?> getEmbeddedModel(Field field) {
        ParameterizedType genericType = (ParameterizedType) field.getGenericType();
        Class<?> embeddedModelClass = (Class<?>) genericType.getActualTypeArguments()[0];
        return embeddedModelClass;
    }
}
