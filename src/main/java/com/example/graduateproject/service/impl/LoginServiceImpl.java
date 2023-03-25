package com.example.graduateproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduateproject.entity.Login;
import com.example.graduateproject.mapper.LoginMapper;
import com.example.graduateproject.service.LoginService;
import com.example.graduateproject.util.MD5;
import com.example.graduateproject.util.Result;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
* @author HP
* @description 针对表【login_table(testdb.`login_table`)】的数据库操作Service实现
* @createDate 2023-02-25 17:18:10
*/
@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login>
implements LoginService{

    @Resource
    private LoginMapper loginMapper;

    @Override
    public Result<Login> login(String email, String password) {

        if(StringUtils.isEmpty(email)||StringUtils.isEmpty(password)){
            return Result.fail();
        }

        //对密码进行加密
        QueryWrapper<Login> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email",email);
        queryWrapper.eq("password", MD5.encrypt(password));

        Login user = baseMapper.selectOne(queryWrapper);


        //  3、判断查询条件
        if (user!=null){
            return Result.ok(user);
        }else {
            return Result.fail();
        }

    }


}
