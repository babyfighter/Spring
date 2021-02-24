package com.adam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//    配置swagger的bean实例
    @Bean
    public Docket docket(Environment environment){

//        controller接口中，返回值存在实体类，就会被扫描到Swagger中

//        设定在特定环境中开启swagger
//        再application.properties中增加 spring.profiles.active=dev
        Profiles profiles = Profiles.of("dev","test");
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .groupName("Adam's Group")//API分组，多个分组就多个Docket实例
//                .enable(flag)//是否启动swagger
                .select()
                //RequestHandlerSelectors，配置要扫描接口的方式
                //basePackage：指定要扫描的包
                //any():扫描全部
                //none（）：不扫描
                //withClassAnnotation：扫描类上的注解，参数是注解的反射对象
                //withMethodAnnotation:扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("com.adam.controller"))
//                .paths(PathSelectors.ant("/adam/**"))//过滤什么路径
                .build();
    }
    private ApiInfo apiInfo(){
        Contact contact= new Contact("Adam","","adam'semail@email.com");

        return new ApiInfo(
                "Adam Documentation",
                "Adam's Documentation",
                "v1.0",
                "urn:tos",
                contact, "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }
}
