package com.bjpowernode.handler;

import com.bjpowernode.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    //目标对象
    private Object target;//SomeServiceImpl类

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象执行方法时，会调用执行这个invoke()
        System.out.println("execute invoke");
        String methodName = method.getName();
        Object res = null;

        if("doSOme".equals(methodName)){
            ServiceTools.doLog();//目标方法之前，输出时间
            //执行目标类的方法，通过Method类实现
            res = method.invoke(target,args);//SomeServiceImpl.,doSOme
            ServiceTools.doTrans();//目标方法之后，提交事务
            //目标方法的执行结果
        }else {
            res = method.invoke(target,args);//SomeServiceImpl.,doOther
        }

        return res;
    }
}
