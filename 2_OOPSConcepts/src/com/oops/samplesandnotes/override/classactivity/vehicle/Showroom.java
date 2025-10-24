package com.oops.samplesandnotes.override.classactivity.vehicle;

public class Showroom {

	public static void main(String[] args) {
		// super class ref = sub class object
		// super class ref = sub class object;
		Vehicle vehicle = new Car("Honda", 10000.0, "City", "white", "Sedan");
		vehicle.printDetails();

		// This will give compiler error, because show Accesories are in the Car class
        // vehicle.showAccessories();
		/**
		 * The compiler must ensure the code is safe and valid for any object of type
		 * Vehicle. Since Vehicle could also be a Bike , and a Bike might not have a
		 * showAccessories() method, allowing the call would be unsafe. The compiler
		 * cannot look into the future to see what specific object ( Car or Bike) the
		 * variable will hold at runtime; it only trusts the declared type (Vehicle).
		 */

		vehicle.getMileage();
		/**
		 * At runtime, the Java Virtual Machine (JVM) sees that the object is a Car, so
		 * it runs the Car class's overridden getMileage() method.
		 */

		/**
		 * Downcasting.
		 * 
		 * By casting, you are essentially telling the compiler, "I, the programmer,
		 * guarantee that the object currently in the vehicle reference is indeed a Car.
		 * Please remove the Vehicle gatekeeper and allow me to access all Car methods."
		 */
		Car car = (Car) vehicle; // int y=x;
		car.printDetails();
		car.getMileage();

		// own method of car class
		car.carInfo();
		String[] accessories = car.showAccessories();
		if (accessories != null) {
			for (String acc : accessories) {
				System.out.println(acc);
			}
		}

		System.out.println("Bike details");
		Vehicle vehicle2 = new Bike("Honda", 10000.0, "Activa", 120, "test", true);
		// Downcasting
		Bike bike = (Bike) vehicle2;

		// Overridden method of Bike
		bike.getMileage();

		// own method of Bike class
		bike.bikeInfo();
		// own method of Bike class
		String[] bikeBrands = bike.showBrands("sports");
		if (bikeBrands != null) {
			for (String bikeBrand : bikeBrands) {
				System.out.println(bikeBrand);
			}
		}

	}
}
