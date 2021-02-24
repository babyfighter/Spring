package com.bjpowernode.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

//拦截器类：拦截用户的请求
public class MyInterceptor implements HandlerInterceptor {
   /*
        preHandle：预处理方法
        参数：Object handler：被拦截的控制器对象
        返回值boolean
        false:请求没有通过拦截器验证，请求到达拦截器就截止了。请求没有被处理

        特点：
        1.方法在控制器方法之前执行
            用户的请求首先到达此方法
        2.早这个方法中可以获取请求的信息，验证请求是否符合要求
            可以验证用户是否登录，验证用户是否有权限访问某个链接地址（url）
            如果验证失败，可以阶段请求，请求不能被处理
            如果验证成功，可以放行请求，此时控制器方法才执行
    */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器的preHandle()");
        //给浏览器一个返回结果
//        request.getRequestDispatcher("/tips.jsp").forward(request,response);
        return true;
    }

    /*
        后处理方法
        参数：Object handler:被拦截的处理器对象MyuController
        特点：
            1.在处理器方法之后执行
            2.能够获取到处理器方法的返回值ModelAndView，可以修改ModelAndView中的
            数据和视图，可以影响到最后的执行结果
            3.主要是对原来的执行结果做二次修正，
     */
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler, ModelAndView mv) throws Exception {
        System.out.println("拦截器的postHandle（）");
        if (mv != null){
            //修改数据
            mv.addObject("mydate",new Date());
            //修改视图
            mv.setViewName("other");
        }
    }
        /*
            最后执行得方法
            参数
            Object handler：被拦截的处理器对象
            Exception ex：程序中发生的一场
            特点：
                1.在请求处理完成后执行的。框架中规定是当你视图处理完成后，对试图执行了forward。
                就认为请求处理完成
                2，一般做资源回收工作的，程序请求过程中创建了一些对象，在这里可以删除，把占用的
                内存回收
         */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器的afterHandle（）");
    }
}
