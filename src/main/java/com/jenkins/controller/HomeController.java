package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String homeController(){
        return "Hello Jenkins";
    }

    @GetMapping("/this")
    public String thisController(){
        return "Hello This is new thing we add on";
    }
}
