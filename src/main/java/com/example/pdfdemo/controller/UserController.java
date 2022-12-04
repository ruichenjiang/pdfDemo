package com.example.pdfdemo.controller;

import com.example.pdfdemo.entity.User;
import com.example.pdfdemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/test")
    public String test(){
        return "ok";
    }

    @PostMapping("/getUser")
    public User getUser(){
        return userService.getUser();
    }

}
