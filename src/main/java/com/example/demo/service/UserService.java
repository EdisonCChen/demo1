package com.example.demo.service;

import com.example.demo.event.UserRegisterEvent;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.UserBean;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    ApplicationContext applicationContext;

    public User add(User user){
        userMapper.add(user);
        return findById(user.getPkid());
    }
    public User findById(int id){
        User user=new User();
        user.setPkid(id);
        return  userMapper.findOne(user);
    }

    public  void  register(UserBean userBean){
        applicationContext.publishEvent(new UserRegisterEvent(this,userBean));
    }
}
