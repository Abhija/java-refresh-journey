package com.bank;

public class Current extends Account {

	public Current(String accountHolder, double balance, double overDraftAmount) {
		super(accountHolder, balance);
		this.overDraftAmount = overDraftAmount;
	}

	/**
	 * Represents the unique feature of a Current account
	 */
	double overDraftAmount = 1000;

	@Override
	void withdraw(double amount) {
		System.out.println("Withdrawal of money from Current  account");
		if (balance < amount) {
			System.out.println("Not enough balance to make this transaction");
		} else {
			balance = balance - amount;
			System.out.println("Amount " + amount + " withdrawn from the Current account, balance is " + balance);
		}

	}

	@Override
	void deposit(double amount) {
		System.out.println(" Going to deposit money in the  Current account");
		balance = balance + amount;
		System.out.println("Balance amount is " + balance);

	}

	void showOverDraftLimit() {

	}

}
