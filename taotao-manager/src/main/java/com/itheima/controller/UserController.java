package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //当前项目spring容器中注入
    //@Autowired
    @Reference
    private UserService userService;

    @RequestMapping("save")
    public String save(){
        System.out.println("调用了UserController的方法!");
        userService.save();
        return "save -- success!!";
    }
}
