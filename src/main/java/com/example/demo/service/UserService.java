package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User add(User user){
        userMapper.add(user);
        return findById(user.getPkid());
    }
    public User findById(int id){
        User user=new User();
        user.setPkid(id);
        return  userMapper.findOne(user);
    }
}
