package com.springdemos.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemos.springcore.map.Customer;

public class Test {
	public static void main(String[] args) {

		//create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/properties/config.xml");
		//get bean
		Locations locations = (Locations) context.getBean("locations");
		
		//dataType
		System.out.println(locations.getDialect().getClass());
		
		//print bean
		System.out.println(locations);
		
	}

}
