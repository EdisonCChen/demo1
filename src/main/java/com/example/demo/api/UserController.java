package com.example.demo.api;

import com.example.demo.model.UserBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register")
    public String register(UserBean userBean){
        userService.register(userBean);
        return userBean.getName()+"注册成功";
    }
}
