package net.engineeringdigest.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//in a spring boot project, always make a HealthCheck

@RestController
public class HealthCheck {

    @GetMapping("/health-check") //mapping to an end point (GET)
    public String healthCheck() {
        return "OK";
    }
}
