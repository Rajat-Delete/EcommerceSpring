package com.example.demo.controllers;

import com.example.demo.dto.OKhttpUserResponseDto;
import com.example.demo.services.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService _userService){
        this.userService = _userService;
    }

    @GetMapping
    public OKhttpUserResponseDto fetchAllUsers() throws IOException {
        return userService.getAllUsers();
    }

}
