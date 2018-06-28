package com.example.demo.mapper.test2;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User2Mapper {
    List<User> getAll();
}
