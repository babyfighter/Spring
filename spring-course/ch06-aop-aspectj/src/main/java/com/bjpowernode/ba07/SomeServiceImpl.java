package com.bjpowernode.ba07;


//目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        //给doSome方法增加一个功能，在doSome执行前，输出方法的执行时间


    }

    @Override
    public String doOther(String name, Integer age) {

        return "abcd";
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("========业务方法doFirst========");
        return "doFirst";
    }

    @Override
    public void doSecond() {
        System.out.println("Execute doSecond()"+(10/0));

    }

    @Override
    public void doThird() {
        System.out.println("Execute doThird()");
    }
}
