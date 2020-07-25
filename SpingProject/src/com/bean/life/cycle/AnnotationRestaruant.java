package com.bean.life.cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationRestaruant {
	public void greetCustomer()
	{
		System.out.println("welcome customer");
	}
	@PostConstruct
	public void init()
	{
		System.out.println("After bean creation");
	}
	@PreDestroy
	public void destory()
	{
		System.out.println("Before bean destory");
	}
}
