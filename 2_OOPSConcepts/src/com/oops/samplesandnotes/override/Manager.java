package com.oops.samplesandnotes.override;

public class Manager extends Employee{
	
	
	@Override
	void calcBonus(double amount) {
		System.out.println(" Magr bonus" + amount*2);
		
	}

}
