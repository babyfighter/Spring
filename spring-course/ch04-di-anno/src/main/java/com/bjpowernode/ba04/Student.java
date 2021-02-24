package com.bjpowernode.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    @Value("李四")
    private String name;
    @Value("30")
    private Integer age;

/*
    引用类型
    1.@Autowired:spring框架提供的注解，实现引用类型的赋值
    通过注解给引用类型赋值，使用的是自动注入原理，支持byName，byType
    @Autowired默认使用的是byType自动注入
    位置：1.在属性定义的上面，无需set方法，推荐
         2.在set方法上面
    使用byName方式：
    1.在属性上面加入@Autowired
    2.在属性上面加入@Qualifier(value="bean的id")表示使用指定名称的bean完成赋值

 */
    @Autowired
    @Qualifier("mySchool")
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
