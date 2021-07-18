package net.dmly.refference.container;

import net.dmly.refference.container.application_events.ApplicationEventsAppConfig;
import net.dmly.refference.container.application_events.EmailService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application6 {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationEventsAppConfig.class);
        context.registerShutdownHook();
        EmailService service = context.getBean("emailService", EmailService.class);
        service.sendEmail("known.spammer@example.org", "spam");
    }

}
