package com.example.graduateproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.graduateproject.entity.Login;
import com.example.graduateproject.mapper.LoginMapper;
import com.example.graduateproject.service.LoginService;
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
        //1、校验信息
        if(StringUtils.isEmpty(email)||StringUtils.isEmpty(password)){
            return Result.fail();
        }
        //2、根据条件进行查询

        //LambdaQueryWrapper<Login> queryWrapper = new LambdaQueryWrapper<>();
//        try {
//            loginMapper.insertUser();
//        }catch (Exception e){
//            log.debug("so 奇怪");
//            System.out.println(e);
//        }

        QueryWrapper<Login> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email",email);
        queryWrapper.eq("password",password);
        Login user = baseMapper.selectOne(queryWrapper);
        System.out.println(user.toString());

//        3、判断查询条件
        if (user!=null){
            return Result.ok(user);
        }else {
            return Result.fail();
        }

    }

    @Override
    public void findAll() {
        System.out.println(baseMapper.selectList(null));
    }
}
