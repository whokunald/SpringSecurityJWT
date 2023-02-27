package com.teamng.jwt.controller;

import com.teamng.jwt.entity.AuthRequest;
import com.teamng.jwt.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {
    @Autowired
    private JwtService authService;
    @PostMapping("/authenticate")
    public String getToken(@RequestBody AuthRequest authRequest){

    }
}
