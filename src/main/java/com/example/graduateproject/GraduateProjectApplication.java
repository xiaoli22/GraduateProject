package com.example.graduateproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.graduateproject.mapper")
public class GraduateProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduateProjectApplication.class, args);
    }

}
