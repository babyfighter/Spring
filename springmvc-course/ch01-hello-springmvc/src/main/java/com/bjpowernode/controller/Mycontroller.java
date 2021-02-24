package com.bjpowernode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
    @Controller:创建处理器对象，放在springmvc容器中
    位置：在类的上面

    能处理请求的都是控制器，MyController叫做后端控制器（back controller）
 */
@Controller
public class Mycontroller {
    /*
        处理用户提交的请求，使用方法来处理
        方法是自定义的，可以有多种返回值和参数，方法名称自定义
     */
    /*
        @RequestMapping:请求映射，把一个请求地址和一个方法绑定在一起，
                       请求指定一个方法处理。修饰的方法叫做处理器方法或控制器方法

        属性：1.value 是一个String，表示请求的uri地址；value值唯一不可重复
              使用时推荐地址以“/”开头
              可以写多个值，多个请求交给同一个方法处理
        位置：1.在方法的上面，常用
                2.在类的上面
        返回值：ModelAndView 表示本次请求的处理结果
        可以指定多个请求地址，
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){//doGet()--service请求处理
        //处理some.do请求，相当于service调用处理完成了
        ModelAndView mv = new ModelAndView();
        //添加数据，框架在最后把数据放到request作用域
        //request.setAttribute("msg","黄英使用springmvc做web开发");
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSOme方法");

        //指定视图的完整路径
        //框架对视图执行forward操作，request.getRequestDispatcher("/show.jsp.forward(...)")
//        mv.setViewName("/show.jsp");
//        mv.setViewName("/WEB-INF/view/show.jsp");
//        配置了视图解析器后，可以使用逻辑名称（文件名），指定视图
        mv.setViewName("show");
        //返回mv
        return mv;
    }
}
