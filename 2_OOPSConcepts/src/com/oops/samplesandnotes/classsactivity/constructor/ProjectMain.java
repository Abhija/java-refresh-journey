package com.oops.samplesandnotes.classsactivity.constructor;

public class ProjectMain {

	public static void main(String[] args) {
		Product product = new Product(2, "Galaxy", 34, "Samsung");

		product.printInfo();
		String[] models = product.showModels(product.brand);
		if (null != models) {
			System.out.println("Models are");
			for (String model : models) {
				System.out.println("Model " + model);
			}
		} else {
			System.out.println("Models not available for this brand");
		}

		System.out.println("The total cost is " + product.totalCost(2));

	}
}
