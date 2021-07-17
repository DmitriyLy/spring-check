package net.dmly.refference.container.property_source;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PropertySourceTestBean {
    private String name;
    private String javaHome;

    public void setName(String name) {
        this.name = name;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    @PostConstruct
    public void init() {
        System.out.println(String.format("PropertySourceTestBean >\n name: %s;\n JAVA_HOME: %s ", name, javaHome));
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PropertySourceTestBean#destroy()");
    }
}
