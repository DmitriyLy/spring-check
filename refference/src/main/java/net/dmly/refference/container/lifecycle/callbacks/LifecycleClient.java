package net.dmly.refference.container.lifecycle.callbacks;

import org.springframework.context.LifecycleProcessor;

public class LifecycleClient implements LifecycleProcessor {
    @Override
    public void onRefresh() {
        System.out.println("LifecycleClient onRefresh");
    }

    @Override
    public void onClose() {
        System.out.println("LifecycleClient onClose");
    }

    @Override
    public void start() {
        System.out.println("LifecycleClient start");
    }

    @Override
    public void stop() {
        System.out.println("LifecycleClient stop");
    }

    @Override
    public boolean isRunning() {
        System.out.println("LifecycleClient isRunning");
        return true;
    }
}
