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

    @RequestMapping(value = "/student")
    public @ResponseBody Student queryStudentById(Integer id){
        Student student = studentService.queryStudentById(id);

        return student;
    }
}
