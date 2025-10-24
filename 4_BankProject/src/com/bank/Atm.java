package com.bank;

import java.util.Scanner;

public class Atm {

	// Assume Savings and Current classes are defined elsewhere

	public static void main(String[] args) {

		// --- 1. SETUP: Create the available accounts (hardcoded for demo) ---
		Account availableSavingsAccount = new Savings("Abhija", 2000, 10);
		Account availableCurrentAccount = new Current("Jayan", 40000, 10000);

		// --- 2. INITIALIZATION: Setup the Scanner and a holding variable ---
		Scanner scanner = new Scanner(System.in);
		Account loggedInAccount = null;
		String userName;

		System.out.println("--- Welcome to ABC Bank ATM ---");

		// --- 3. LOGIN LOOP ---
		while (loggedInAccount == null) {
			System.out.print("Please enter your Account Holder Name: ");
			userName = scanner.nextLine().trim();

			if (userName.equalsIgnoreCase(availableSavingsAccount.accountHolder)) {
				loggedInAccount = availableSavingsAccount;
			} else if (userName.equalsIgnoreCase(availableCurrentAccount.accountHolder)) {
				loggedInAccount = availableCurrentAccount;
			} else {
				System.out.println("Your account is not available. Please try again.");
			}
		}

		System.out.println("\nWelcome, " + loggedInAccount.accountHolder + ".");

		System.out.println("Select an Option:");
		System.out.println("  1. Deposit");
		System.out.println("  2. Withdraw");
		System.out.println("  3. Exit");
		System.out.print("Enter your choice (1-3): ");

		String choice = scanner.nextLine().trim();

		try {
			switch (choice) {
			case "1":
				System.out.print("Enter amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				scanner.nextLine(); // Consume newline
				loggedInAccount.deposit(depositAmount);
				break;

			case "2":
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				scanner.nextLine(); // Consume newline
				loggedInAccount.withdraw(withdrawAmount);
				break;
			case "3":
				System.out.println("Thank you for using ABC Bank. Goodbye!");
				scanner.close();
				break;

			default:
				// Handle invalid menu choice
				System.out.println("Invalid option selected. Please choose from 1-4.");
				break;
			}
		} catch (Exception e) {
			// Catch potential issues like NumberFormatException if user enters non-number
			System.out
					.println("\n[ERROR] Invalid input or transaction failed. Please ensure you enter a valid number.");
			scanner.nextLine(); // Clear the buffer to prevent loop issues
		}

	}

}