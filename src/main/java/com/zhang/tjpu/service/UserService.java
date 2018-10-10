package com.zhang.tjpu.service;

import com.zhang.tjpu.entity.User;

public interface UserService {
    //添加User
    public void addUser(User user);
    //根据id检查User
    public User getUserById(Integer id);
    //用户签到
    public void userSignIn(String signTime,Integer id,Integer age);
}
