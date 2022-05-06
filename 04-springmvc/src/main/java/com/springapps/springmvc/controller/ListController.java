package com.springapps.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springapps.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		List<Employee> emps = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setId(11);
		emp.setName("Max");
		emp.setSalary(5000);
		emps.add(emp);

		emp = new Employee();
		emp.setId(12);
		emp.setName("Will");
		emp.setSalary(5500);
		emps.add(emp);

		emp = new Employee();
		emp.setId(13);
		emp.setName("Wilson");
		emp.setSalary(5100);
		emps.add(emp);

		ModelAndView mv = new ModelAndView();
		mv.addObject("employees", emps);
		mv.setViewName("displaylist");
		return mv;

	}
}
