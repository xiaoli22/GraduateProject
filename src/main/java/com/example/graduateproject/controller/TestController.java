package com.example.graduateproject.controller;

import com.example.graduateproject.mapper.LoginMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
  @author wkc
  @data 2023/2/25 - 16:42 
*/
@RestController
public class TestController {
    //返回字符串，使用@ReposeBody，可以写在类上，可以写在方法上。返回的数据是直接写给浏览器的，而不是跳转页面
    //@RestController = @Controller+@ReposeBody
    @RequestMapping("/hello")
    public String handle01(){
        return "Let me do some interesting things";
    }

    @Resource
    LoginMapper loginMapper;

    @GetMapping("/insert")
    public void insert(){
        loginMapper.insertUser();
    }
}
