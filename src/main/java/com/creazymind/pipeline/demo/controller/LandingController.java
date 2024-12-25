package com.creazymind.pipeline.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {

    @GetMapping("/landing")
    public String landing() {
        return "Hello from landing";
    }
}
