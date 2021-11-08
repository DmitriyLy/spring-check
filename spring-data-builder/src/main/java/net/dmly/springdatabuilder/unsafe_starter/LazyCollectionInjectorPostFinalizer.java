package net.dmly.springdatabuilder.unsafe_starter;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Field;
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

                Class<?> embeddedModelClass = getEmbeddedModel();

                Field[] fields = model.getClass().getDeclaredFields();
                for (Field field : fields) {
                    if (List.class.isAssignableFrom(field.getType())) {
                        LazySparkList lazySparkList = realContext.getBean(LazySparkList.class);
                        //lazySparkList.setContent();
                        lazySparkList.setOwnerId(ownerId);
                        lazySparkList.setModelClass(embeddedModelClass);
                        lazySparkList.setForeignKeyName();
                    }
                }
            }
        }
        return retVal;
    }
}
