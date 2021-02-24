package com.adam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncController asyncController;

    @RequestMapping("/hello")
    public String hello(){
        asyncController.hello();
        return "OK";
    }
}
