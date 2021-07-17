package net.dmly.refference.container;

import net.dmly.refference.container.property_source.PropertySourceAppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application5 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(PropertySourceAppConfig.class);
        context.registerShutdownHook();
    }
}
