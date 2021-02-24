package com.bjpowernode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
/*
    @RequestMapping:
        value:所有请求地址的公共部分，叫做模块名称
        位置：类的上面
 */

@Controller
public class Mycontroller {
        /*
            处理器方法返回String--表示逻辑视图名称，需要配置视图解析器
         */

    @RequestMapping(value = "/returnString-view.do")
    public String doReturnView(HttpServletRequest request,String name, Integer age){//doGet()--service请求处理
        System.out.println("doReturnView, name= "+name+ " age="+age);
        //手工添加数据到request作用域
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);

        //show：逻辑视图名称，项目中配置了视图解析器
        //框架对视图执行forward转发操作
        return "show";
    }
    //处理器方法返回String，表示完整视图路径，此时不能配置视图解析器
    @RequestMapping(value = "/returnString-view2.do")
    public String doReturnView2(HttpServletRequest request,String name, Integer age){//doGet()--service请求处理
        System.out.println("doReturnView2, name= "+name+ " age="+age);
        //手工添加数据到request作用域
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);

        //完整视图路径，项目中配置了视图解析器
        //框架对视图执行forward转发操作
        return "/WEB-INF/view/show.jsp";
    }
}
