package com.springdemos.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemos.springcore.map.Customer;

public class Test {
	public static void main(String[] args) {

		//create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/map/config.xml");
		//get bean
		Customer customer = (Customer) context.getBean("customer");
		
		//dataType
		System.out.println(customer.getProducts().getClass());
		
		//print bean
		System.out.println(customer);
		
	}

}
