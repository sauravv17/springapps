package com.springapps.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.springmvc.dto.User;

@Controller
public class UserController {
	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "userreg";
	}

	@RequestMapping(value = "registeruser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println("recieved" + user);
		model.addAttribute("user", user);
		return "userregresult";
	}

}
