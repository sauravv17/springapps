package com.springdemos.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemos.springcore.dibasic.Employee;

public class Test {
	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/reftypes/config.xml");
		// get bean
		Student student = (Student) context.getBean("student");

		// print bean
		System.out.println(student);

	}

}
