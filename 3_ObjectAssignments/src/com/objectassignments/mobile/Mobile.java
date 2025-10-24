package com.objectassignments.mobile;

public class Mobile {

	String model;
	String brand;
	String color;

	public Mobile(String model, String brand, String color) {
		this.model = model;
		this.brand = brand;
		this.color = color;
	}

	void getDetails() {
		System.out.println("Mobile [model=" + model + ", brand=" + brand + ", color=" + color + "]");
	}

}
