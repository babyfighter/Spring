package com.adam.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {
    @RequestMapping(value = "/say")
    public  @ResponseBody Object say(String message){
        return "Hello"+ message;
    }
}
