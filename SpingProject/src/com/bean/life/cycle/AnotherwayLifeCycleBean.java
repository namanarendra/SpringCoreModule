package com.bean.life.cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AnotherwayLifeCycleBean implements InitializingBean, DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Just After bean creation");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Just Before bean destory");
	}
	
	public void greetCustomer()
	{
		System.out.println("welcome customer!!!");
	}

}
