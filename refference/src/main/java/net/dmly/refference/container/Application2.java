package net.dmly.refference.container;

import net.dmly.refference.container.java_based_config.AppConfig;
import net.dmly.refference.container.java_based_config.bean_annotation.BeanAnnotationAppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, BeanAnnotationAppConfig.class);
        context.registerShutdownHook();

    }
}
