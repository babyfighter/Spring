package com.bjpowernode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
    @RequestMapping:
        value:所有请求地址的公共部分，叫做模块名称
        位置：类的上面
 */
@RequestMapping("/user")
@Controller
public class Mycontroller {
        /*
            @RequestMapping:请求映射
                        属性：method，表示请求的方式，它的值是RequestMethod类枚举值
            使用方式：RequestMethod.GET/POST
         */
    //指定some.do使用get请求方式
    @RequestMapping(value = "/some.do", method = RequestMethod.GET)
    public ModelAndView doSome(){//doGet()--service请求处理
        //处理some.do请求，相当于service调用处理完成了
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSOme方法");

        mv.setViewName("show");
        //返回mv
        return mv;
    }
    //指定other.do是post请求方式
    @RequestMapping(value = "/other.do",method = RequestMethod.POST )
    public ModelAndView doOther(){//doGet()--service请求处理
        //处理some.do请求，相当于service调用处理完成了
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doOther方法");

        mv.setViewName("other");
        //返回mv
        return mv;
    }
    //不指定请求方式，没有限制
    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst(){//doGet()--service请求处理
        //处理some.do请求，相当于service调用处理完成了
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doFirst方法");

        mv.setViewName("first");
        //返回mv
        return mv;
    }
}
