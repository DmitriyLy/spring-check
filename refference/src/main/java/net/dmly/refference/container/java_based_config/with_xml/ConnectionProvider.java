package net.dmly.refference.container.java_based_config.with_xml;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class ConnectionProvider {
    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @PostConstruct
    public void init() {
        System.out.println(String.format("ConnectionProvider >\n url: %s\n url: %s\n password: %s", url, username, password));
    }
}
