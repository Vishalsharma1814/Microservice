package com.practice.rest.webservices.restfulwebservices.controller;

import com.practice.rest.webservices.restfulwebservices.models.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/helloWorldBean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/helloWorldBean/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s ", name));
    }
}
