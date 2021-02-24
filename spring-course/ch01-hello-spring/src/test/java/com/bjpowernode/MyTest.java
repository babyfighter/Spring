package com.bjpowernode;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
    /*
        spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中的所有对象
        spring创建对象：默认调用无参数构造方法
     */
    @Test
    public void test02(){
//        使用spring容器创建的对象
//        1.指定spring配置文件名称
        String config="beans.xml";
//        2.创建表示spring容器的对象，ApplicationContext
//        通过构造方法读取配置文件的时候就可以创建java对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        调用方法
//        getBean("配置文件中bean的id值")
        SomeService service = (SomeService) ac.getBean("someService");
//        使用spring创建好的对象
        service.doSome();
    }
    /*
        获取spring容器中java对象的信息
     */
    @Test
    public void test03(){
        String config="beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取容器定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println(nums);
        //容器中每个定义的对象的名称
        String names[] = ac.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
    }
    @Test
    public void test04(){
        String config="beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取容器定义的对象的数量
        Date my = (Date) ac.getBean("mydate");
        System.out.println(my);
    }
}
