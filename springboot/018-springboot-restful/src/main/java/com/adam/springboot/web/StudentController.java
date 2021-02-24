package com.adam.springboot.web;

import com.adam.springboot.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @RequestMapping(value = "/student")
    public Object student(Integer id, Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    @RequestMapping(value = "/student/detail/{id}/{age}")
    public Object student1(@PathVariable("id") Integer id,
                            @PathVariable("age") Integer age){
        Map<String, Object> retMap = new HashMap<>();

        retMap.put("id", id);
        retMap.put("age", age);
        return retMap;
    }

    @RequestMapping(value = "/student/detail/{id}/{status}")
    public Object student2(@PathVariable("id") Integer id,
                           @PathVariable("status") Integer status){
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("id", id);
        retMap.put("age", status);
        return retMap;
    }
    //student1和student2会出现请求路径迷糊错误
    //通常在RESTful风格中方法的请求方式按照增删改查的请求方式来区分

    @GetMapping(value = "/student/detail/{id}/{status}")
    public Object student3(@PathVariable("id") Integer id,
                           @PathVariable("status") Integer status){
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("id", id);
        retMap.put("age", status);
        return retMap;
    }

}
