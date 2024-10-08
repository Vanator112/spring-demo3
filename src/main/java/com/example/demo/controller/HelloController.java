package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping(value = "/printHello")
    @ResponseBody
    public String printHello(){
        return "Hello World!";
    }

    @GetMapping(value = "/printParam")
    @ResponseBody
    public String printParam(@RequestParam String name, @RequestParam String age){
        return "Hello World, " + name + " age: " + age;
    }

    @GetMapping(value = "/printPathVariable/{location}/products")
    @ResponseBody
    public String printPathVariable(@PathVariable String location){
        return "Hello World, from " + location;
    }
}
