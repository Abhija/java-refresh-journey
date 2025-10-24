package com.oops.samplesandnotes.override.classactivity.vehicle;

public class Vehicle {

	String brand;
	double price;
	String model;

	public Vehicle(String brand, double price, String model) {
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
	}

	void getMileage() {

		System.out.println("Mileage is good");
	}
	
	

	void printDetails() {
		System.out.println("Brand is"+brand);
		System.out.println("Price is"+price);
		System.out.println("Model is"+model);

	}

}
