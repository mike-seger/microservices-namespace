
package com.example.microservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class Microservice1Controller {

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        return Map.of("app", "microservice-1");
    }
}
