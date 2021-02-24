package com.adam.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//	springboot项目代码必须发哦到Aplication类所在的同级目录或子目录中
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
