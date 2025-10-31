package com.abstraction.activities.activity2;

public abstract class Branch2 extends Bank {

	@Override
	void eduLoan() {
		System.out.println("Education loan in branch2");
	}

	@Override
	void housingLoan() {
		System.out.println("Housing loan in branch2");
	}

	void loanTypes() {
		System.out.println("short-term,long-term");
	}
}



