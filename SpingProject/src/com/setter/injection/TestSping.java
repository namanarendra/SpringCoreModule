package com.setter.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSping {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant restaurant = (Restaurant)context.getBean("restaurantSetterBean");
		restaurant.greetCustomer();
	}
}
