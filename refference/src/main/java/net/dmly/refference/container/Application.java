package net.dmly.refference.container;

import net.dmly.refference.container.dependencies.lazy.LazyInitBean;
import net.dmly.refference.container.factories.services.AccountService;
import net.dmly.refference.container.factories.services.ClientService;
import net.dmly.refference.container.jpetstore.services.PetStoreService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("application/application-context.xml");

        //GenericApplicationContext context = new GenericApplicationContext();
        context.registerShutdownHook();

        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        ClientService clientService = context.getBean("clientService", ClientService.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);

        clientService.execute();
        accountService.execute();

        System.out.println("\n>>>>>>>>>>>>>>>>>>> Control Point >>>>>>>>>>>> \n");

        LazyInitBean lazyInitBean = context.getBean("lazyInitBean", LazyInitBean.class);

        //context.close();

        System.out.println("It works!");
    }
}
