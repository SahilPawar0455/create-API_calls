package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SpringDemo {
    @RequestMapping(value = {"/body"})
    public String sayHello(){
       return "Hello from BridgeLabz";
    }

    @RequestMapping(value = {"/body1"})
    public String sayHello1(@RequestParam(value = "name") String name){
        return "Hello "+ name+" From Bridgelabz";
    }

}
