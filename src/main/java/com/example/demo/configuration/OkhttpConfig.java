package com.example.demo.configuration;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OkhttpConfig {


    @Bean
    public OkHttpClient okHttpClient(){
        return new OkHttpClient();
    }
}
