package com.bjpowernode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {
        /*
            处理器方法返回ModelandView,实现faoward
            语法：setViewName("forward:视图文件完整路径")
            特点；不和视图解析器一同使用
         */
    @RequestMapping(value = "/doForward.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用");
        mv.addObject("fun","执行的doSome方法");
        //转发forward
//        mv.setViewName("forward:/WEB-INF/view/show.jsp");
        mv.setViewName("forward:/hello.jsp");
        return mv;
    }
    /*
        处理器方法返回ModelandView,实现redirect
        语法：setViewName("redirect:视图文件完整路径")
        特点；不和视图解析器一同使用

        框架对重定向的操作：
        1.把Model中的简单类型的数据，转为string使用，作为hello.jsp的get请求参数使用
        目的是在doRedirect.do和hello.jsp两次请求之间传递数据
        2.在目标hello.jsp页面可以使用参数集合对象，${param}获取请求参数值
           ${param.myname}
           3.重定向不能访问/WEB-INF资源
     */

    @RequestMapping(value = "/doRedirect.do")
    public ModelAndView doRedirect(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用");
        mv.addObject("fun","执行的doRedirect方法");
        //redirect
//        mv.setViewName("forward:/WEB-INF/view/show.jsp");
        mv.setViewName("redirect:/hello.jsp");
        return mv;
    }
}
