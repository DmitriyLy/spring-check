package net.dmly.refference.container.di.circular;

import org.springframework.beans.factory.InitializingBean;

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
