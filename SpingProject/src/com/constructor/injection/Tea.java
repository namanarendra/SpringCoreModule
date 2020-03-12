package com.constructor.injection;

public class Tea implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("preparing hot tea");
	}

}
