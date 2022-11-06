package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SpringDemo {
    @RequestMapping(value = {"/body"})
      public String sayHello(){
       return "Hello from BridgeLabz";
       }
}
