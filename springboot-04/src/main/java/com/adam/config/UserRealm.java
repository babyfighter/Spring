package com.adam.config;

import com.adam.pojo.User;
import com.adam.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;
//  授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权");
        return null;
    }
//  认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行了认证");

        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
//        连接真实数据库
        User user = userService.queryUserByName(userToken.getUsername());
        if (user==null){
            return null;
        }
//      用户名，密码 数据库中取
//        String name ="root";
//        String password = "123456";
//
//
//        if (!userToken.getUsername().equals(name)){
//            return null;
//        }
//        密码认证，shiro左
        return new SimpleAuthenticationInfo("",user.getPwd(),"");
    }
}
