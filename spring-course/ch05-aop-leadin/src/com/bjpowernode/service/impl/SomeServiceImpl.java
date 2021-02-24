package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.util.ServiceTools;

//Service类的代码不修改，也能增加输出时间，事务
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        ServiceTools.doLog();
        System.out.println("doSome Executed");
    }

    @Override
    public void doOther() {
        ServiceTools.doTrans();
        System.out.println("doOther Executed");
    }
}
