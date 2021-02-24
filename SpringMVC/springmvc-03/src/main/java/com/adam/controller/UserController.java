package com.adam.controller;

import com.adam.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody //不会走视图解析器，直接返回一个字符串
    public String json1(){
        User user = new User("1",13,"male");
        return user.toString();
    }
}
