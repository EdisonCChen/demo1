package com.example.demo.event;

import com.example.demo.model.UserBean;
import org.springframework.context.ApplicationEvent;

@lombok.Getter
public class UserRegisterEvent extends ApplicationEvent {
private UserBean user;

public UserRegisterEvent(Object object,UserBean user){
    super(object);
    this.user=user;
    System.out.println("----------------------"+user.getName()+"，密码："+user.getPassword());
}
}
