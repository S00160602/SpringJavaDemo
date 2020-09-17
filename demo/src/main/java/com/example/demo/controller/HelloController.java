package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String getHelloWorld(){

        return "Hello World";
    }
    @RequestMapping("/howdy")
    public String getHelloWorld1(String name){

        return "Howdy " + name;
    }


}
