package com.constructor.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestarant {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaurant restaurant = (Restaurant)context.getBean("restarantConstructorBean");
		restaurant.prepareTea();
	}

}
