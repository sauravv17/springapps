package com.springdemos.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemos.springcore.dibasic.Employee;

public class Test {
	public static void main(String[] args) {

		//create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/list/config.xml");
		
		Hospital hosp = (Hospital) context.getBean("hospital");
		System.out.println(hosp);
		
	}

}
