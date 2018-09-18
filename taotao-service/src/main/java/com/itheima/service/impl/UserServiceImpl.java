package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save() {
        System.out.println("调用了UserServiceImpl的方法!");
    }
}
