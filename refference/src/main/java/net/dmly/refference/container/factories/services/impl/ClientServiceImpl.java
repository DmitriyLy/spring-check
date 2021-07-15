package net.dmly.refference.container.factories.services.impl;

import net.dmly.refference.container.factories.services.ClientService;

import javax.annotation.PreDestroy;

public class ClientServiceImpl implements ClientService {
    @Override
    public void execute() {
        System.out.println("ClientServiceImpl#execute");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ClientServiceImpl#destroy");
    }
}
