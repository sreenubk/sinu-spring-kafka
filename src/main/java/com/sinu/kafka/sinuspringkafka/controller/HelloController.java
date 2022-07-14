package com.sinu.kafka.sinuspringkafka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
         return "Welcome to sinu-spring-kafka a new world for messaging!";
    }
    
}
