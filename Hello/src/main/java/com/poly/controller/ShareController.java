package com.poly.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.model.User;

@Controller
@RequestMapping("share")
public class ShareController {
	@GetMapping("index")
	public String index(Model model) {
		model.addAttribute("message", "Hello Spring");
		model.addAttribute("Hello String");
		model.addAttribute("now", new Date());
		
		model.addAttribute(new Date());
		
		model.addAttribute(new User());
		
		return "share";
	}

}
