package com.srishti.training;

import java.util.Scanner;

public class ScannerNotes {

	public static void main(String[] args) {
		// This is to read from the console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scanner.next();
		System.out.println("Name is" + name.toUpperCase());

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Age is" + age);

		System.out.print("Enter your city: ");
		String city = scanner.next();

		// Close the scanner to release system resources
		scanner.close();

		// Delimiter is space
		// If we add enter, each will be called one by one
		// Instead we can give it in space
		// SAMPLE IS GIVEN BELOW
//		Enter the name
//		Abhija Jayan 33 Trivandrum
//		Name isABHIJA
//		Enter your age: Exception in thread "main" java.util.InputMismatchException
//			at java.base/java.util.Scanner.throwFor(Scanner.java:947)
//			at java.base/java.util.Scanner.next(Scanner.java:1602)
//			at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
//			at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
//			at Demo/com.srishti.training.ScannerNotes.main(ScannerNotes.java:15)
	}

}
