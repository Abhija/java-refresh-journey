package com.oops.samplesandnotes.abstractclassactivity;

public class RuralBranch extends Bank {

	@Override
	void carLoan() {
		System.out.println("Rural branch 10%");
		// TODO Auto-generated method stub

	}

	@Override
	void eduLoan() {
		System.out.println(" Rural branch 5%");
		// TODO Auto-generated method stub

	}

	@Override
	void housingLoan() {
		System.out.println(" Rural branch 8%");

		// TODO Auto-generated method stub

	}
	
	
	void depositType() {
		System.out.println("Only savings and fd supported");
	}

}
