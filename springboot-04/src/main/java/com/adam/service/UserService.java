package com.adam.service;

import com.adam.pojo.User;

public interface UserService {
    User queryUserByName(String name);
}
