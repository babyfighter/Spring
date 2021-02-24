package com.adam.springboot.web;

import com.adam.springboot.config.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource
    private School school;

    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "Name:?????? "+school.getName()+school.getWebsite();
    }
}
