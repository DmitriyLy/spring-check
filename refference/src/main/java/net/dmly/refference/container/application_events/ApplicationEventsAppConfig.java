package net.dmly.refference.container.application_events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan("net.dmly.refference.container.application_events")
public class ApplicationEventsAppConfig {

    @Bean
    public List<String> blockedList() {
        return List.of(
                "known.spammer@example.org",
                "known.hacker@example.org",
                "john.doe@example.org"
        );
    }

    @Bean
    public EmailService emailService() {
        EmailService service = new EmailService();
        service.setBlockerList(blockedList());
        return service;
    }

    @Bean
    public BlockedListNotifier blockedListNotifier() {
        BlockedListNotifier notifier = new BlockedListNotifier();
        notifier.setNotificationAddress("blockedlist@test.com");
        return notifier;
    }

}
