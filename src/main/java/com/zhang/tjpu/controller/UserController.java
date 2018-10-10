package com.zhang.tjpu.controller;

import com.zhang.tjpu.entity.User;
import com.zhang.tjpu.service.UserService;
import com.zhang.tjpu.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping(value = "/user")
public class UserController{
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/signUp")
    public void addUser(User user, HttpServletResponse response)throws Exception{
        userService.addUser(user);
        response.sendRedirect("/jsp/addSuccess.jsp");
    }

    @ResponseBody
    @RequestMapping(value = "/test")
    public String test(){
        return "/index";
    }

    @ResponseBody
    @RequestMapping(value = "/getUserById")
    public AjaxResult getUserById(Integer id){
        User user = userService.getUserById(id);
        return AjaxResult.getOK(user);
    }

    @ResponseBody
    @RequestMapping(value = "/signIn")
    public void userSignIn(Integer id,Integer age,HttpServletResponse response)throws Exception{
        SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String signTime  = df.format(new Date());
        userService.userSignIn(signTime,id,age);
        response.sendRedirect("/jsp/signInSuccess.jsp");
    }

}