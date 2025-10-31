package com.abstraction.assignments;

public abstract class Employee {

	protected String empName;
	protected double salary;
	protected int empId;
	protected final String COMPANYNAME = "Tata Elxsi";

	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}

	abstract void calcBonus(double amount);
	abstract void showProjects();

	public String[] showCourses() {
		return new String[] { "Java Fundamentals", "OOPS Architecture" };
	}

	final void showRules() {
		System.out.println("\n--- Company Rules ---");
		System.out.println("Rule: No personal storage devices to office");
		System.out.println("Rule: No tailgating");
		this.officeHours();
	}

	private void officeHours() {
		System.out.println(" 8 hours per day ");
	}

}
