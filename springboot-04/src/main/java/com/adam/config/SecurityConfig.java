package com.adam.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        请求授权规则
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1");
//        没有权限默认跳转到登录页面
        http.formLogin();
//      注销
        http.logout().logoutUrl("/");
//      开启记住我功能 cookie,默认保存两周
        http.rememberMe();

    }

//    认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//      数据可以在数据库里度 auth.jdbcAuthentication
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("adam").password(new BCryptPasswordEncoder().encode("123")).roles("vip1","vip3")
                .and()
                .withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("vip2");

    }
}
