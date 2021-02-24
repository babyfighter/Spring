package com.bjpowernode.service.ba02;

public class Student {
    private String name;
    private int age;

    //声明一个引用类型
    private School school;

// 设值注入需要有set方法，没有set方法时报错的

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}

