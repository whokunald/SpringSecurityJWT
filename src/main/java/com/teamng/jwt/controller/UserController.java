package com.teamng.jwt.controller;

import com.teamng.jwt.entity.UserEntity;
import com.teamng.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public String addNewUser(@RequestBody UserEntity userEntity){
        return userService.addUser(userEntity);
    }
}
