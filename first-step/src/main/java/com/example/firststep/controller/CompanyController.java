package com.example.firststep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CompanyController {

    @GetMapping("/hello")
    public String get() {
        System.out.println("first start");
        return "first start! hello!";
    }
}
