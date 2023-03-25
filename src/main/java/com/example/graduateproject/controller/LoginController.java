package com.example.graduateproject.controller;

import com.example.graduateproject.entity.Login;
import com.example.graduateproject.service.LoginService;
import com.example.graduateproject.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
  @author wkc
  @data 2023/2/25 - 16:45 
*/
@Slf4j
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Result<Login> login(String email,String password){
        log.info("user login");
        return loginService.login(email, password);
    }

    @PostMapping("/register")
    public Result<>


}
