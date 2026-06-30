package com.example.practice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public  String hello(){
        return "hello its my first project";
    }
    @GetMapping("/bye")
    public  String bye(){
        return "bybye its my first project";
    }
}
