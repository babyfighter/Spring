package com.bjpoernode;

import com.bjpowernode.ba08.SomeService;
import com.bjpowernode.ba08.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest08 {
    @Test
    public void test08(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");

        System.out.println("proxy:"+proxy.getClass().getName());

        //通过代理的对象执行方法
        proxy.doThird();
    }
}
