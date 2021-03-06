package com.cjss.employeespring.controller;

import com.cjss.employeespring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    public HelloService helloservice;

    @GetMapping("/hello")
    public String index(){ return "HELLO! "+helloservice.getDetails();}
}
