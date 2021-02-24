package com.bjpowernode.util;

import java.util.Date;

public class ServiceTools {
    public static void doLog() {
        System.out.println("非业务方法"+new Date());
    }
    public static void  doTrans(){
        System.out.println("业务方法"+new Date());
    }
}
