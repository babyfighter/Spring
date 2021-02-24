package com.adam.controller;

import com.adam.mapper.UserMapper;
import com.adam.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

//    @GetMapping("/queryUserList")
//    public List<User> queryUserList(){
//        List<User> userList = userMapper.queryUserList();
//        for (User user:userList){
//            System.out.println(user);
//        }
//        return userList;
//    }
}
