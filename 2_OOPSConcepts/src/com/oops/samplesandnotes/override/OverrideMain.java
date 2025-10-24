package com.oops.samplesandnotes.override;

public class OverrideMain {
	
	public static void main(String[] args) {
		Employee employee = new Manager();
		employee.calcBonus(2000);
		employee.greet();
		
		employee = new Developer();
		employee.calcBonus(2000);
		employee.greet();
		
	}

}
