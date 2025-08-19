package com.example.demo.dto;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersItem{
	private String password;
	private Address address;
	private String phone;
	private Name name;
	private Integer id;
	private String email;
	private String username;
}
