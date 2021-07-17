package net.dmly.refference.container.java_based_config.bean_annotation;

import net.dmly.refference.container.java_based_config.bean_annotation.service.GpsService;
import net.dmly.refference.container.java_based_config.bean_annotation.service.NavigationService;
import net.dmly.refference.container.java_based_config.bean_annotation.service.impl.NavigationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans({@ComponentScan("net.dmly.refference.container.java_based_config.bean_annotation")})
public class BeanAnnotationAppConfig {

    @Bean
    public TransferService transferService() {
        return new TransferServiceImpl();
    }

    @Bean
    public NavigationService navigationService(GpsService gpsService) {
        return new NavigationServiceImpl(gpsService);
    }

}
