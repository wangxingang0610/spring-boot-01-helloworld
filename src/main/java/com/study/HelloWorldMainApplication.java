package com.study;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//说明这是一个Spring Boot应用
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //参数一定需要是 HelloWorldMainApplication spring boot 标注的类
        SpringApplication.run(HelloWorldMainApplication.class,args);//springboot启动
    }

}
