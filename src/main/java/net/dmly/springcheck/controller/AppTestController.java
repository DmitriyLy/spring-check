package net.dmly.springcheck.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/test/")
public class AppTestController {

    @RequestMapping("test-get")
    public Map<String, String> testGet() {
        return Map.of("it", "works");
    }

}
