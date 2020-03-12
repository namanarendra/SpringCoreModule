package com.constructor.injection;


public class Restaurant {
	IHotDrink idrink;
	public Restaurant(IHotDrink idDrink) {
		this.idrink = idDrink;
	}
	public void prepareTea() {
		idrink.prepareHotDrink();
	}
	
}
