package com.bjpowernode.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/*
    @Aspect:时aspectj框架中的注解
    作用：表示当前类是前面类
    切面类：用来给业务方法增加功能的类，在这个类中有前面的功能代码
    位置：在类定义的上面
 */


@Aspect
public class MyAspect {
    /*
        定义方法，实现切面功能
        定义要求：
        1.公共方法
        2.没有返回值
        3.方法名称自定义
        4.方法可以有参数，也可以没有参数
            如果有参数，参数不是自定义，有几个参数类型可以使用
     */

    /*
        @Before:前置通知注解
        属性：value，切入点表达式，表示切面的功能执行的位置
        位置：在方法的上面
        特点：
            1.在目标方法之前先执行
            2.不会改变目标方法的执行结果
            3.不会影响目标方法的执行
     */
//    @Before(value = "execution(void com.bjpowernode.ba01.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        //切面要执行的功能代码
//        System.out.println("前置通知，切面功能：在目标方法之前输出执行时间"+ new Date());
//    @Before(value = "execution(void *..SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        //切面要执行的功能代码
//        System.out.println("2前置通知，切面功能：在目标方法之前输出执行时间"+ new Date());
//        @Before(value = "execution(* *..SomeServiceImpl.doSome(String,Integer))")
//        public void myBefore(){
//            //切面要执行的功能代码
//            System.out.println("3前置通知，切面功能：在目标方法之前输出执行时间"+ new Date());
//    @Before(value = "execution(* *..SomeServiceImpl.do*(..))")
//    public void myBefore(){
//        //切面要执行的功能代码
//        System.out.println("3前置通知，切面功能：在目标方法之前输出执行时间"+ new Date());


//    JoinPoint:业务方法，要加入切面功能的业务方法
//    作用：在通知方法中获取方法执行时的信息
//    如果切面功能中需要用到方法的信息,就加入JoinPoint
//    Joinpoint参数的值由框架赋予，必须是第一个位置的参数
    @Before(value = "execution(* *..SomeServiceImpl.do*(..))")
    public void myBefore(JoinPoint jp){
        //获取方法的完整定义
        System.out.println("方法的签名(定义)"+jp.getSignature());
        System.out.println("方法的名称"+jp.getSignature().getName());
        //获取方法的实参
        Object args[] = jp.getArgs();
        for (Object arg:args){
            System.out.println(arg);
        }
        //切面要执行的功能代码
        System.out.println("3前置通知，切面功能：在目标方法之前输出执行时间"+ new Date());
    }
}
