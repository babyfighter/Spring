package com.adam.mapper;


import com.adam.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {

    public User queryUserByName(String name);

}
