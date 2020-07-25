package com.bean.life.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestaruant {

	public static void main(String[] args) {	
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		//importent point
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaruant restaruant = (Restaruant) context.getBean("lifeCycleBean");
		restaruant.greetCusomer();
		
		
		AnnotationRestaruant annotationRestaruant = (AnnotationRestaruant)context.getBean("lifeCycleBeanUsingAnnotation");
		annotationRestaruant.greetCustomer();
		
		
		AnotherwayLifeCycleBean anotherwayLifeCycleBean = (AnotherwayLifeCycleBean)context.getBean("lifeCycleBeanUsingAnotherwayLifeCycleBean");
		annotationRestaruant.greetCustomer();
		
	}

}
