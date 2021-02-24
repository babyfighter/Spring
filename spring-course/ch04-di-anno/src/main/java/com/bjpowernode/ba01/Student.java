package com.bjpowernode.ba01;

import org.springframework.stereotype.Component;


/*
    @Component:创建对象的，等同于<bean>的功能
    属性：value 对象的名称，也就是bean的id值，是唯一的
    创建的对象在整个spring容器中就一个
    位置：在类的上面

    spring中和@Component功能一致，创建对象的注解还有：
    1.@Repository（持久层类）：放在dao实现类上面，表示创建dao对象，dao对象能够访问数据库
    2.@Servce（业务层类）：方式在service的实现类上，可以做业务处理，可以有事务等功能
    3.@Controller（控制器类）：放在控制器（处理器）类的上面，控制器对象能够接受用户提交的参数，显示请求的处理结果(servlet)
    注解使用语法和@Component一样，但这三个注解还有额外功能
    以上三个注解是给项目的对象分层的，不属于这三个类的可以用@Component

 */

//@Component(value = "myStudent")
//@Component("myStudent") value可以省略
//@Component 不指定对象名称，由spring提供默认名称：类名首字母小写

public class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
