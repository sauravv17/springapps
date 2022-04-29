package com.springdemos.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/dependencycheck/config.xml");

		// get the hospital bean from the container
		Prescription presc = (Prescription) context.getBean("prescription");
		
		// print the bean
		System.out.println(presc);
		System.out.println(presc.hashCode());
		
		//checking hash code eg: in beanscopes
		Prescription presc2 = (Prescription) context.getBean("prescription");
		System.out.println(presc2.hashCode());

		
	}

}