package net.dmly.refference.container.application_events;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ContextEventNotifier {

    @EventListener({ContextStartedEvent.class, ContextRefreshedEvent.class})
    @Async
    public void handleContextStart(Object event) {
        System.out.println(String.format("ContextEventNotifier#handleContextStart >\n event: %s", event));
    }

}
