package com.collection;

import java.util.List;

public class Restarant {
	public List allEmpNames;

	public void setAllEmpNames(List allEmpNames) {
		this.allEmpNames = allEmpNames;
	}
	
	public void printAllEmployees() {
		System.out.println("All Employees : "+allEmpNames);
	}
	

}
