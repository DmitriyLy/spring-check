package net.dmly.refference.container.application_events;

import org.springframework.context.ApplicationListener;

public class BlockedListNotifier implements ApplicationListener<BlockedListEvent> {

    private String notificationAddress;

    @Override
    public void onApplicationEvent(BlockedListEvent event) {
        System.out.println(String.format("BlockedListNotifier#onApplicationEvent >\n event: %s\n address: %s\n" +
                " content: %s", event, event.getAddress(), event.getContent()));
    }

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }
}
