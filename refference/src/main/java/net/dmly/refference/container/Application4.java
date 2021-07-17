package net.dmly.refference.container;

import net.dmly.refference.container.profile.DataProvider;
import net.dmly.refference.container.profile.ProfileAppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Application4 {
    public static void main(String[] args) {

        DataProvider dataProvider;
        AnnotationConfigApplicationContext context;
        ConfigurableEnvironment environment;

        context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();

        environment = context.getEnvironment();
        environment.setActiveProfiles("dev");

        context.register(ProfileAppConfig.class);
        context.refresh();

        dataProvider = context.getBean("dataProvider", DataProvider.class);
        System.out.println(dataProvider.provide());


        context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();

        environment = context.getEnvironment();
        environment.setActiveProfiles("prod");

        context.register(ProfileAppConfig.class);
        context.refresh();

        dataProvider = context.getBean("dataProvider", DataProvider.class);
        System.out.println(dataProvider.provide());
    }
}
