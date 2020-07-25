package com.bean.life.cycle;

public class Restaruant {
	
	public void init()
	{
		System.out.println("just after bean creation");
	}
	
	public void greetCusomer()
	{
		System.out.println("welcome customer");
	}
	public void destory()
	{
		System.out.println("just before bean destory");
	}
}
