package com.springdemos.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/constructorinjection/config.xml");

		// get the hospital bean from the container
		Address address = (Address) context.getBean("address");

		// print the bean
		System.out.println(address);
		System.out.println("1st address hashCode" + address.hashCode());

		Address address2 = (Address) context.getBean("address");
		System.out.println("2nd address hashCode" + address2.hashCode());
		// for same hashcode change scope to 'singleton' in config.xml
	}

}