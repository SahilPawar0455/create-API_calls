package com.bridgelabz.controller;

import com.bridgelabz.model.User;
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

    @RequestMapping("/body2{name}")
    public String sayHello2(@PathVariable String name){
        return "Hello "+ name+" From Bridgelabz";
    }

    @PostMapping("/body3")
    public String sayHello3(@RequestBody User user){
        return "Hello "+user.getFname()+" "+user.getLname()+" From Bridgelabz";
    }

    @PutMapping("/body4{fname}")
    public String sayHello4(@PathVariable String fname,@RequestParam (value = "lname") String lname){
        return "Hello "+fname+" "+lname+" From Bridgelabz";
    }
}
