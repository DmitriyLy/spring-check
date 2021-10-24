package net.dmly;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectFactory {
    private static ObjectFactory objectFactory = new ObjectFactory();

    private Config config;
    private List<ObjectConfigurator> configurators = new ArrayList<>();

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    @SneakyThrows
    private ObjectFactory() {
        config = new JavaConfig("net.dmly", new HashMap<>(Map.of(Policeman.class, AngryPoliceman.class)));
        for (Class<? extends ObjectConfigurator> aClass : config.getScanner().getSubTypesOf(ObjectConfigurator.class)) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;

        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }


        T t = implClass.getDeclaredConstructor().newInstance();


        return t;

    }
}
