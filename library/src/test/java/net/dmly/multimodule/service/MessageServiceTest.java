package net.dmly.multimodule.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest("service.message=Hello")
public class MessageServiceTest {

    @Autowired
    private MessageService messageService;

    @Test
    public void contextLoads() {
        assertThat(messageService.message()).isNotNull();
    }

    @SpringBootConfiguration
    static class TestConfiguration {

    }
}
