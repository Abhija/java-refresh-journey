package com.oops.samplesandnotes.classsactivity.constructor;

public class Product {

	int id;
	String name;
	int price;
	String brand;

	Product(int id, String name, int price, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	void printInfo() {
		System.out.println("Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + "]");
	}

	String[] showModels(String brand) {
		String[] samsungmodels = { "S2", "S1" };
		String[] applemodels = { "S2", "S1" };
		String[] models = null;
		if (brand.equals("Samsung")) {
			models = samsungmodels;
		} else if (brand.equals("Apple")) {
			models = applemodels;
		}
		return models;

	}

	int totalCost(int quantity) {
		return quantity * price;

	}
}
