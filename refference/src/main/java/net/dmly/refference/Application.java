package net.dmly.refference;

import net.dmly.refference.factories.services.AccountService;
import net.dmly.refference.factories.services.ClientService;
import net.dmly.refference.jpetstore.services.PetStoreService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        //GenericApplicationContext context = new GenericApplicationContext();

        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        ClientService clientService = context.getBean("clientService", ClientService.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);

        clientService.execute();
        accountService.execute();

        context.close();

        System.out.println("It works!");
    }
}
