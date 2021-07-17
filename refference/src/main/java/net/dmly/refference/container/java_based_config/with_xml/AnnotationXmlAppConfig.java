package net.dmly.refference.container.java_based_config.with_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("net.dmly.refference.container.java_based_config.with_xml")
@ImportResource("classpath:application3/annotation-xml-config.xml")
public class AnnotationXmlAppConfig {

    @Bean
    public ConnectionProvider connectionProvider() {
        return new ConnectionProvider();
    }

}
