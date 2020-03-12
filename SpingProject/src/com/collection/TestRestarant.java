package com.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestarant {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restarant restarant = (Restarant) context.getBean("collectionsBean");
		restarant.printAllEmployees();
	}

}
