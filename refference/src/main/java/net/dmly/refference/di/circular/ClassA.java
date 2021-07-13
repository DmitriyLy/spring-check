package net.dmly.refference.di.circular;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class ClassA implements InitializingBean {
    private ClassB classB;

    /*@Autowired
    public ClassA(ClassB classB) {
        this.classB = classB;
    }*/

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("classB: " + classB);
    }
}
