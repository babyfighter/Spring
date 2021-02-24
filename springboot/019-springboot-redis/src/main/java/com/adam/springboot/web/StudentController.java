package com.adam.springboot.web;

import com.adam.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/put")
    public @ResponseBody Object put(String key, String value){
        return "已经放入redis";
    }
}
