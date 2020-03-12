package com.constructor.injection;

public class LemonTea implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("Prepared Lemon Tea");
	}

}
