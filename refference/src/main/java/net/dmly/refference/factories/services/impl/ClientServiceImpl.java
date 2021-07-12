package net.dmly.refference.factories.services.impl;

import net.dmly.refference.factories.services.ClientService;

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
