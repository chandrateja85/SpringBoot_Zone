package com.example.demo_flow_u.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloworld(){
        return "hello chandra teja aaaaasskkkjjkj";
    }
}
