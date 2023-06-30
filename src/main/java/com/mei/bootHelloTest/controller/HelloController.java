package com.mei.bootHelloTest.controller;

import com.mei.meiSpringBootStarterAutoconfigure.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping
    public String sayHello(){
        return helloService.sayHello("李笑笑");
    }
}
