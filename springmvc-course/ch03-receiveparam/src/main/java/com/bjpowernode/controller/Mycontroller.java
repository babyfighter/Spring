package com.bjpowernode.controller;


import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/*
    @RequestMapping:
        value:所有请求地址的公共部分，叫做模块名称
        位置：类的上面
 */

@Controller
public class Mycontroller {
        /*
            逐个接受请求参数：
                要求：控制器方法的形参名和请求中参数名必须一致
            框架接受请求参数：
                1.使用request对象接受请求参数
                2.springmvc通过DispatcherServlet调用控制器的doSome方法
                    调用方法时，按名称对应，把接收的参数赋值给形参
         */

    @RequestMapping(value = "/receiveproperty.do")
    public ModelAndView doSome(String name, int age){//doGet()--service请求处理
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",Integer.valueOf(age));
        mv.setViewName("show");
        return mv;
    }
    /*
        请求中参数名和处理器方法的形参名不一样
        @RequestParam：解决请求中参数名形参名不一样
        属性1.value请求中的参数名称
            2.required boolean类型，默认是true
                true：表示请求中必须包含此参数
        位置：在处理器方法的形参定义的前面
     */
    @RequestMapping(value = "/receiveparam.do")
    public ModelAndView receiveParam(@RequestParam(value = "rname",required = false)String name,
                                     @RequestParam(value = "rage",required = false) Integer age){//doGet()--service请求处理
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }

        /*  对象参数接收：多个参数使用
            处理器方法形参时java对象，这个对象的属性名和请求中参数名一样
            框架会创建从形参的java对象，给属性赋值
            请求中参数是name，框架会调用setName()
            @return
         */
    @RequestMapping(value = "/receiveobject.do")
    public ModelAndView receiveParam(Student myStudent){//doGet()--service请求处理
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",myStudent.getName());
        mv.addObject("myage",myStudent.getAge());
        mv.addObject("mystudent",myStudent);
        mv.setViewName("show");
        return mv;
    }
}
