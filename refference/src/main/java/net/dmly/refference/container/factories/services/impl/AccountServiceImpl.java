package net.dmly.refference.container.factories.services.impl;

import net.dmly.refference.container.factories.services.AccountService;

import javax.annotation.PreDestroy;

public class AccountServiceImpl implements AccountService {
    @Override
    public void execute() {
        System.out.println("AccountServiceImpl#execute");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AccountServiceImpl#destroy");
    }
}
