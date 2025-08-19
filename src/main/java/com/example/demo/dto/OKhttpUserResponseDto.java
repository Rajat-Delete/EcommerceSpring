package com.example.demo.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OKhttpUserResponseDto{
	 String message;
	 List<UsersItem> users;
	 String status;
}