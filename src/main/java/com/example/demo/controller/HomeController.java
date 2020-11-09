package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class HomeController {

    @GetMapping("/admin")
    public String adminHome() {
        return "admin home";
    }
}
