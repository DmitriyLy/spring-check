package net.dmly.refference.container.property_source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application5/app.properties")
public class PropertySourceAppConfig {

    @Autowired
    Environment environment;

    @Bean
    public PropertySourceTestBean propertySourceTestBean() {
        PropertySourceTestBean bean = new PropertySourceTestBean();
        bean.setName(environment.getProperty("testbean.name"));
        bean.setJavaHome(environment.getProperty("JAVA_HOME"));
        return bean;
    }

}
