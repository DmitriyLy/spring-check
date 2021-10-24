package net.dmly;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InjectPropertyAnnotationObjectConfiguratorImpl implements ObjectConfigurator {
    private Map<String, String> propertiesMap;

    @SneakyThrows
    public InjectPropertyAnnotationObjectConfiguratorImpl() {
        String path = ClassLoader.getSystemClassLoader().getResource("application.properties").getPath();
        Stream<String> lines = new BufferedReader(new FileReader(path)).lines();
        propertiesMap = lines
                .map(line -> line.split("="))
                .collect(Collectors.toMap(array -> array[0], array -> array[1]));
    }

    @Override
    @SneakyThrows
    public void configure(Object t, ApplicationContext context) {
        Class<?> implClass = t.getClass();

        Field[] declaredFields = implClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            InjectProperty annotation = declaredField.getAnnotation(InjectProperty.class);

            if (annotation != null) {
                String value = annotation.value().isEmpty() ? propertiesMap.get(declaredField.getName())
                        : propertiesMap.get(annotation.value());
                declaredField.setAccessible(true);
                declaredField.set(t, value);
            }
        }
    }
}
