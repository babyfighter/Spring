package com.bjpowernode.ba06;

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
    @Resource:来自jdk中的注解，spring框架提供了对这个注解的功能支持，给引用类型复制
                javax.annotation.
                自动注入原理，支持byName，byType默认byName
    位置：1.在属性定义的上面，无需set方法，推荐
         2.在set方法的上面
    @Resource只使用不要Name方式，需要增加一个属性name
        name的值是bean的idResource
       默认是byName，如果byName自动注入失败，再使用byType
 */

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
