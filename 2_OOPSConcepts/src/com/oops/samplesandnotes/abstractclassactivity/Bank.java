package com.oops.samplesandnotes.abstractclassactivity;

public abstract class Bank {
	abstract void carLoan();

	abstract void eduLoan();

	abstract void housingLoan();
	
	
	final void adminDetails() {
		System.out.println("Admin is CEO");
	}
}
