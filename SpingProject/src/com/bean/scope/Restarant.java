package com.bean.scope;

public class Restarant {
	public String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer()
	{
		System.out.println(welcomeNote);
	}
}
