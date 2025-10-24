package com.oops.samplesandnotes.override;

public class Developer extends Employee{
	
	
	@Override
	void calcBonus(double amount) {
		System.out.println(" Developer bonus" + amount*2);
		
	}

}
