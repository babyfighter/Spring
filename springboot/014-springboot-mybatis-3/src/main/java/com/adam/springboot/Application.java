package com.adam.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.adam.springboot.mapper")//开启扫描Mapper接口的包以及子包
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
