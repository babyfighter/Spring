package com.adam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
//真实访问地址：项目名/HelloController/hello
    @RequestMapping("/hello")
    public String hello(Model model){
//        封装数据
        model.addAttribute("msg","Hello,SpringMVC");
        return "hello";
    }
}
