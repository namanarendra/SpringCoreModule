package com.core.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResturent {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurent restaurent = (Restaurent) context.getBean("restaurantBean");
		restaurent.greetCustomer();
	}
}
