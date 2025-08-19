package com.example.demo.dto;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address{
	private String zipcode;
	private String number;
	private String city;
	private String street;
	private Geolocation geolocation;
}
