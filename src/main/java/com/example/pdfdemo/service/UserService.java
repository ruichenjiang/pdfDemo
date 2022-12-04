package com.example.pdfdemo.service;

import com.example.pdfdemo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(){
        User user = new User();
        user.setUserName("jiang");
        return user;
    }

    public void createUser(User user){

    }
}
