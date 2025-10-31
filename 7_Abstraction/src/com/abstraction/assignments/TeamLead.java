package com.abstraction.assignments;

public abstract class TeamLead extends Employee {

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("TeamLead Bonus Calculated: " + (salary * 0.10 + amount));
	}

	// One abstract method skipped, So make this as abstract

	void corporateServices() {
		System.out.println("TeamLead Corporate Services taking Interview ");
	}
}
