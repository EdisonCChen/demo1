package com.example.demo.listener.annotation;

import com.example.demo.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationRegisterUserEmailListener {
    @EventListener
    public void sendMail(UserRegisterEvent userRegisterEvent){
        System.out.println("用户注册成功，发送邮件");
    }
}
