package com.springapps.springmvcorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapps.springmvcorm.entity.User;
import com.springapps.springmvcorm.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "userreg";
	}
	
	public String registerUser(@ModelAttribute("user") User user,ModelMap model) {
		int result =userservice.save(user);
		
		return result;
	}

}
