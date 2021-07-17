package net.dmly.refference.container.profile;

import org.springframework.context.annotation.*;

import javax.xml.crypto.Data;

@Configuration
@ComponentScan("net.dmly.refference.container.profile")
public class ProfileAppConfig {

    @Bean("dataProvider")
    @Scope("prototype")
    @Profile("dev")
    public DataProvider dataProviderDev() {
        return new DataProvider("Dev data");
    }

    @Bean("dataProvider")
    @Scope("prototype")
    @Profile("prod")
    public DataProvider dataProviderProd() {
        return new DataProvider("Prod data");
    }

}
