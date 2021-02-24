package com.bjpowernode.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
    @Value:简单类型的属性赋值
    属性：value是string类型的
    位置：1.在属性定义的上面，无序set方法，推荐使用
         2.在set方法的上面
 */


@Component("myStudent")

public class Student {
    @Value(value = "张飞")
    private String name;
    @Value(value = "29")
    private int age;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
