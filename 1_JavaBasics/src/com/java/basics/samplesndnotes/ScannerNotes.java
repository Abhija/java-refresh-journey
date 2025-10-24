package com.java.basics.samplesndnotes;

import java.util.Scanner;

public class ScannerNotes {

	public static void main(String[] args) {
		// This is to read from the console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Name " + name.toUpperCase());

		System.out.println("Enter id");
		int empId = sc.nextInt();
		System.out.println("Id " + empId);
		sc.nextLine();

		System.out.println("Enter City");
		String city = sc.nextLine();
		System.out.println("City " + city);

		System.out.println("Enter salary");
		double salary = sc.nextDouble();
		System.out.println("Salary " + salary);

		sc.close();

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
