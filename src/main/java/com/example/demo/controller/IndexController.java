package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/admin")
    public String adminHome() {
        return "ADMIN HOME";
    }

    @GetMapping("/user")
    public String userHome() {
        return "user home";
    }
}
