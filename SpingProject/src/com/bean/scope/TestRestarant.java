package com.bean.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestarant {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restarant restarantObj1 = (Restarant)context.getBean("beanScopeBean");
		restarantObj1.setWelcomeNote("Obj1 is setting welcome note property");
		restarantObj1.greetCustomer();
		
		Restarant restarantObj2 = (Restarant)context.getBean("beanScopeBean");
		restarantObj2.greetCustomer();
		
		/*scope : prototype 
		output : Obj1 is setting welcome note property
					null
			
		scope : singleton 
		output : Obj1 is setting welcome note property
				Obj1 is setting welcome note property*/
	}

}
