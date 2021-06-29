package net.dmly.multimodule.application;

import net.dmly.multimodule.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "net.dmly.multimodule")
@RestController
public class Application {

    private final MessageService messageService;

    public Application(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/")
    public String home() {
        return messageService.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
