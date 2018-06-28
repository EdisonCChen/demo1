package com.example.demo.mapper.test1;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User1Mapper {
    List<User> getAll();

}
