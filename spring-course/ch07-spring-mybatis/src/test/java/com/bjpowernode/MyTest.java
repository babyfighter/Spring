package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        String names[] = ctx.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }

    @Test
    public void testDaoInsert(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
    //获取spring容器中的dao对象
        StudentDao dao = (StudentDao) ctx.getBean("studentDao");
        Student student = new Student();
        student.setId(1013);
        student.setAge(30);
        student.setName("周峰");
        student.setEmail("zhoufeng@qq.com");
        int nums = dao.insertStudent(student);
        System.out.println(nums);
    }

    @Test
    public void testServiceInsert(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ctx.getBean("studentService");

        Student student = new Student();
        student.setId(1015);
        student.setAge(26);
        student.setName("李胜利");
        student.setEmail("shegnli@qq.com");
        //spring mybatis整合使用，事务是自动提交的
        int nums = service.addStudent(student);
        System.out.println(nums);
    }

    @Test
    public void testServiceSelect(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ctx.getBean("studentService");
        List<Student> studnets = service.queryStudent();
        for (Student stu:studnets){
            System.out.println(stu);
        }

    }
}