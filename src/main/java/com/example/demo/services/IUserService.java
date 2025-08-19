package com.example.demo.services;

import com.example.demo.dto.OKhttpUserResponseDto;

import java.io.IOException;

public interface IUserService {

    public OKhttpUserResponseDto getAllUsers() throws IOException;
}
