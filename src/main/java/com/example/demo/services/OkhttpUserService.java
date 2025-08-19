package com.example.demo.services;

import com.example.demo.dto.OKhttpUserResponseDto;
import com.example.demo.gateway.IUserGateway;
import com.example.demo.gateway.OkhttpUserGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OkhttpUserService implements  IUserService{

    private final IUserGateway userGateway;

    public OkhttpUserService(IUserGateway _userGateway){
        this.userGateway = _userGateway;
    }

    @Override
    public OKhttpUserResponseDto getAllUsers() throws IOException {
        return userGateway.getAllUsers();
    }
}
