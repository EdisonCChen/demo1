package com.example.demo.api;

import com.example.demo.mapper.test1.User1Mapper;
import com.example.demo.mapper.test2.User2Mapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/user")
public class UserApi {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private User1Mapper user1Mapper;
    @Autowired
    private User2Mapper user2Mapper;

    @Autowired
    public UserApi(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/add")
    public Object add(@RequestBody User user){
        return userService.add(user);
    }


    @PostMapping("/testObj")
    public void testObj() throws Exception {
        Map map = new HashMap();
        ValueOperations<String, String> operations=redisTemplate.opsForValue();
        map.put("test1",123);
        operations.set("user",map.toString());
        operations.set("123", "123");
        operations.set("com.neo.f", "123",1,TimeUnit.SECONDS);
//        Thread.sleep(1000);
        //redisTemplate.delete("com.neo.f");
        boolean exists=redisTemplate.hasKey("com.neo.f");
        if(exists){
            System.out.println("exists is true");
        }else{
            System.out.println("exists is false");
        }
        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
    @RequestMapping("/getall1")
    public List<User> users(User user){
        return   user1Mapper.getAll();
    }
    @RequestMapping("/getall2")
    public List<User> users2(User user){
        return   user2Mapper.getAll();
    }
}
