package com.example.pdfdemo.controller;

import com.example.pdfdemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserController {

    private UserService userService;

    @PostMapping("/test")
    public String test(){
        return "ok";
    }
}
