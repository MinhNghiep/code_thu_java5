package com.poly.model;

import org.springframework.boot.convert.DataSizeUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String username;
	private String password;
}
