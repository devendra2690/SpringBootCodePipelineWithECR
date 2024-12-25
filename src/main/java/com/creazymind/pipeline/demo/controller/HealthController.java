package com.creazymind.pipeline.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String healthCheck() {
        // Verify this message
        return "App is up and Running..!!";
    }
}
