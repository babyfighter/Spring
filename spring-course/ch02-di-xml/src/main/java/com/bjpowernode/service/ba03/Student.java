package com.bjpowernode.service.ba03;

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

    public Student(String myname, int myage, School mySchool){
        System.out.println("adadadadadadadadadaa");
//        属性赋值
        this.age=myage;
        this.name=myname;
        this.school=mySchool;
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

