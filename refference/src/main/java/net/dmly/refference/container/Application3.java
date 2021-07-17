package net.dmly.refference.container;

import net.dmly.refference.container.java_based_config.with_xml.AnnotationXmlAppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application3 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AnnotationXmlAppConfig.class);
        context.registerShutdownHook();
    }
}
