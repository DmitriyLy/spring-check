package net.dmly.refference.container.java_based_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JavaBasedConfigController {

    private final JavaBasedConfigService configService;

    @Autowired
    public JavaBasedConfigController(JavaBasedConfigService configService) {
        this.configService = configService;
    }

    @PostConstruct
    public void init() {
        configService.doStuff();
    }

    @PreDestroy
    private void destroy() {
        System.out.println("JavaBasedConfigController > destroy()");
    }
}
