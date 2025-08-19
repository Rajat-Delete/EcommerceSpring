package com.example.demo.gateway;

import com.example.demo.dto.OKhttpUserResponseDto;
import com.example.demo.gateway.Api.OkHttpUsersApi;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class OkhttpUserGateway implements IUserGateway{

    private final OkHttpUsersApi okHttpUsersApi;

    public OkhttpUserGateway(OkHttpUsersApi _okHttpUsersApi){
        this.okHttpUsersApi = _okHttpUsersApi;
    }

    @Override
    public OKhttpUserResponseDto getAllUsers() throws IOException {
        return okHttpUsersApi.getAllUsers();
    }
}
