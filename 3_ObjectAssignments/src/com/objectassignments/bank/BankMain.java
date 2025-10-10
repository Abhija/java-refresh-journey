package com.objectassignments.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Bank bank = new Bank(30000);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to withdraw or deposit, Enter yes or No");
		String isNeeded = scanner.next().toUpperCase();

		switch (isNeeded) {

		case "YES":
			System.out.println("Please enter withdraw amount");
			double withdrawAmount = scanner.nextDouble();
			bank.withdraw(withdrawAmount);
			break;
		case "NO":
			System.out.println("OK, Thanks");
			break;
		default:
			System.out.println("Invalid option. Please enter Yes or No.");
			break;

		}
		
	    scanner.close(); 

	}

}
