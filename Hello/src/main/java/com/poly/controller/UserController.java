package com.poly.controller;

import javax.servlet.http.HttpServlet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.model.User;
import com.poly.utils.CookieUtils;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpServletResponse response; 
	
	@GetMapping("create")
	public String createGet() {
		return "user_create";
	}
	
	@PostMapping("create")
	public String createPost() {
		
		String remember = request.getParameter("remember");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password); 
		
		if(remember != null) {
			int hours = (remember == null ) ? 0 : 30 * 24;
			CookieUtils.add("username", username, hours, response);
			CookieUtils.add("password", password, hours, response);
			request.getSession().setAttribute("user", user);
		}
		
		request.setAttribute("user", user);
		
		return "detail";
		
	}
}
