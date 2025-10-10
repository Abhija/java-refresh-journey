package com.objectassignments.bank;

public class Bank {

	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}

	void withdraw(double amount) {
		double newBalance = this.balance - amount;
		System.out.println(newBalance);
		if (newBalance < 0) {
			System.out.println("Not enough Money in your account, available balance is "+ this.balance);
		} else {
			this.balance = newBalance;
			System.out.println("Amount deducted, available balace is " + this.balance);
		}
	}

	void deposit(double amount) {
		double newBalance = this.balance + amount;
		this.balance = newBalance;
		System.out.println("Amount credited, available balance is " + this.balance);

	}
	
	
	double getBalance() {
		return this.balance;
	}

}
