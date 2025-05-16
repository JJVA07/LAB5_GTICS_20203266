package com.example.lab5_gtics_20203266.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "login";
    }

    @GetMapping("/adivinanzas")
    public String home() {
        return "adivinanzas";
    }
}
