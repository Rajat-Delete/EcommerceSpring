package com.example.demo.gateway;

import com.example.demo.dto.OKhttpUserResponseDto;

import java.io.IOException;

public interface IUserGateway {

    public OKhttpUserResponseDto getAllUsers() throws IOException;
}
