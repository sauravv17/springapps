package com.springdemos.springcore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemos.springcore.dibasic.Employee;

public class Test {
	public static void main(String[] args) {

		//create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/standalone/collections/config.xml");
		//get bean
		ProductsList prods = (ProductsList) context.getBean("products");
		
		//type of list
		System.out.println(prods.getProductNames().getClass());
		
		//print bean
		System.out.println(prods);
		
	}

}
