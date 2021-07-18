package net.dmly.refference.container.application_events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.List;

public class EmailService implements ApplicationEventPublisherAware {

    private List<String> blockerList;
    private ApplicationEventPublisher applicationEventPublisher;

    public void setBlockerList(List<String> blockerList) {
        this.blockerList = blockerList;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void sendEmail(String address, String content) {
        if (blockerList.contains(address)) {
            applicationEventPublisher.publishEvent(new BlockedListEvent(this, address, content));
            return;
        }
    }
}
