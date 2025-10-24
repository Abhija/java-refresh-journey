package com.bank;

/**
 * Abstract class for the Account Abstract class cannot be instantiated,
 * 
 * @author Abhija
 *
 */
public abstract class Account {

	String accountHolder;
	double balance;

	// Minimum balance
	/**
	 * LEARNING Ensures this critical business rule (the minimum balance) cannot be
	 * changed at runtime because of the final keyword
	 */
	final double minimumBalance = 500;

	// Bank Name
	/**
	 * LEARNING The is the same for every account. Using ensures only one copy
	 * exists in memory, regardless of how many objects are created. If same data is
	 * there for all the objects, then making it non static may make multiple copies
	 * in the memory
	 */
	static String bankName = "ABC Bank";

	public Account(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
		//There is no point of initializing static variable
		// Final is also not changable
	}

	/**
	 * LEARNING : This enforces that every subclass must provide its own specific
	 * implementation of how money is withdrawn and deposited
	 */
	abstract void withdraw(double amount);

	/**
	 * LEARNING : This enforces that every subclass must provide its own specific
	 * implementation of how money is withdrawn and deposited
	 */
	abstract void deposit(double amount);

	/**
	 * LEARNING : Defines a common utility/policy method that is identical for all
	 * accounts and cannot be overridden by subclasses.What ever is common will be
	 * there in the final class. It should not be overridden
	 */
	final void showBankPolicy() {
		System.out.println("You must adhere to the ABC bank pilicy");
	}

	/**
	 * Allows access to common data without needing an object. So the methods in an
	 * abstract class can be called, but it should be class methods
	 */
	static void bankDetails() {
		System.out.println("The name of the bank is" + bankName);
	}

}
