package com.bjpowernode.vo;

//保存请求参数值的一个普通类
public class Student {
//    属性名和请求中参数名一样
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
