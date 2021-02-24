package com.bjpowernode;

import com.bjpowernode.service.ba02.School;
import com.bjpowernode.service.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    @Test
    public void test01(){
        String config="ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);
    }

    @Test
    public void test02(){
        com.bjpowernode.service.ba02.Student student = new com.bjpowernode.service.ba02.Student();
        student.setName("lisi");
        student.setAge(26);

        School school = new School();
        school.setName("yizhong");
        school.setAddress("bj");

        student.setSchool(school);
        System.out.println(student);
    }
}
