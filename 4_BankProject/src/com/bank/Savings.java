package com.bank;

public class Savings extends Account {

	public Savings(String accountHolder, double balance, double interestRate) {
		super(accountHolder, balance);
		this.interestRate = interestRate;
	}

	/**
	 * Interest Rate that the User will get, only applicable for Savings account
	 */
	double interestRate = 1000;

	@Override
	void withdraw(double amount) {
		System.out.println("Withdrawal of money from Saving's account");
		if (balance < amount) {
			System.out.println("Not enough balance to make this transaction");
		} else {
			balance = balance - amount;
			System.out.println("Amount " + amount + " withdrawn from the Savings account, balance is " + balance);
		}

	}

	@Override
	void deposit(double amount) {
		System.out.println(" Going to deposit money in the  Saving's account");
		balance = balance + amount;
		System.out.println("Balance amount is " + balance);

	}

	void depositTypes() {
		System.out.println("The several types are Salary account , Children's account");
	}

}
