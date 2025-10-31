package com.abstraction.assignments;

public class Manager extends Employee {

	protected String activity;

	// It is insisting to add the constoctor, why - Parametrized constrctor in the
	// parent class

	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}

	// Overrife teh abstract method, the implementation should be specific to the
	// Manager. It is definitely different, that is why it is abstract
	@Override
	void calcBonus(double amount) {
		System.out.println("Manager Bonus Calculated: " + (salary * 0.15 + amount));
	}

	// Nit mandatory
	@Override
	public String[] showCourses() {
		System.out.println("Manager Courses: Google AI cert for managers");
		return new String[] { "Google AI", "Verify" };
	}

	@Override
	void showProjects() {
		System.out.println("RDKM, STAF");
	}

	void funClub() {
		System.out.println(" Activity: " + activity);
	}

}
