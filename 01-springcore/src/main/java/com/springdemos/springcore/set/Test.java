package com.springdemos.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemos.springcore.set.CarDealer;

public class Test {
	public static void main(String[] args) {

		//create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/set/config.xml");
		//get bean
		CarDealer dealer = (CarDealer) context.getBean("dealer");
		
		//dataType
		System.out.println(dealer.getModels().getClass());
		
		//print bean
		System.out.println(dealer);
		
	}

}
