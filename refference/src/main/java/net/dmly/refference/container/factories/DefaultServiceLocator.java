package net.dmly.refference.container.factories;

import net.dmly.refference.container.factories.services.AccountService;
import net.dmly.refference.container.factories.services.ClientService;
import net.dmly.refference.container.factories.services.impl.AccountServiceImpl;
import net.dmly.refference.container.factories.services.impl.ClientServiceImpl;

import javax.annotation.PreDestroy;

public class DefaultServiceLocator {
    private static ClientService clientService = new ClientServiceImpl();
    private static AccountService accountService = new AccountServiceImpl();

    public ClientService createClientServiceInstance() {
        return clientService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DefaultServiceLocator#destroy");
    }
}
