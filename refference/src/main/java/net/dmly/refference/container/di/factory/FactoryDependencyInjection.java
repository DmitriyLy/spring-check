package net.dmly.refference.container.di.factory;

import org.springframework.beans.factory.InitializingBean;

public class FactoryDependencyInjection implements InitializingBean {
    private final ClassA classA;
    private final ClassB classB;
    private final int intValue;

    private FactoryDependencyInjection(ClassA classA, ClassB classB, int intValue) {
        this.classA = classA;
        this.classB = classB;
        this.intValue = intValue;
    }

    public static FactoryDependencyInjection createInstance(ClassA classA, ClassB classB, int intValue) {
        return new FactoryDependencyInjection(classA, classB, intValue);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(String.format("FactoryDependencyInjection > classA: %s; classB: %s; intValue: %s", classA, classB, intValue));
    }
}
