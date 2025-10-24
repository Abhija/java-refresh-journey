package com.oops.samplesandnotes.override;

public class Tester extends Employee {

	@Override
	void calcBonus(double amount) {
		System.out.println(" Tested bonus" + amount * 2);

	}

}
