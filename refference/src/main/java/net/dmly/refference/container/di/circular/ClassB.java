package net.dmly.refference.container.di.circular;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class ClassB implements InitializingBean {
    private ClassA classA;

    @Autowired
    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("classA: " + classA);
    }
}
