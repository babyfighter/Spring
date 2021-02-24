package com.adam.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/message")
    public String userDetail(Model model){
        model.addAttribute("data","SPringboot integraged Theymeleaf");
        return "message";
    }
}
