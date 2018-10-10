package com.zhang.tjpu.service.impl;

import com.zhang.tjpu.entity.User;
import com.zhang.tjpu.mapper.UserMapper;
import com.zhang.tjpu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void addUser(User user){
        userMapper.addUser(user);
    }
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    public void userSignIn(String signTime,Integer id,Integer age){
        userMapper.setSignState(signTime,id,age);
    }

}
