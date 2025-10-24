package com.oops.samplesandnotes.override.classactivity.vehicle;

public class Car extends Vehicle {

	String color;
	String type;

	public Car(String brand, double price, String model, String color, String type) {
		super(brand, price, model);
		this.color = color;
		this.type = type;
	}

	@Override
	void getMileage() {
		System.out.println("Car mileage is good");
	}

	// own methods
	String[] showAccessories() {
		return new String[] { "car cover", "rear a/c", "music system" };
	}

	void carInfo() {
		System.out.println("Details of car");
		// print all details of car
		printDetails(); // this prints model, brand, price
		System.out.println("Color: " + color);
		System.out.println("Type: " + type);
	}
}
