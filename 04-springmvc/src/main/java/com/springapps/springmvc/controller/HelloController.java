package com.springapps.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name", "Max");
		modelAndView.addObject("salary", 5000);
		modelAndView.setViewName("hello");
		return modelAndView;
	}

}
