package net.dmly.refference.factories;

import net.dmly.refference.factories.services.AccountService;
import net.dmly.refference.factories.services.ClientService;
import net.dmly.refference.factories.services.impl.AccountServiceImpl;
import net.dmly.refference.factories.services.impl.ClientServiceImpl;

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
