package com.bean.loading;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestaruant {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restaruant restaruant = (Restaruant) context.getBean("loadingBean");
		restaruant.greetCustomer();
	}

}
