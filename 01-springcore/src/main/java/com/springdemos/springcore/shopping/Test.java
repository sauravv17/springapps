package com.springdemos.springcore.shopping;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemos.springcore.dibasic.Employee;

public class Test {
	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/shopping/config.xml");
		// get bean
		Cart cart = (Cart) context.getBean("cart");

		// print bean
		System.out.println(cart);

	}

}
