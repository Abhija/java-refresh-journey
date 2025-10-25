package com.encapsulation.classnotes;

/**
 * Example for JAVA BEAN : It is a public class with private instance variables
 * and public getter and setter method
 * 
 * @author Abhija
 *
 */
public class Employee {

	// 1. Data Hiding (Encapsulation)
	private String empName;
	private static double salary;

	// Final field should be initialized here or in constrcutor
	// Also a setter method cannot be written for the final variable
	// private final int empId;
	// Where is Final Used
	// Customer private final String customerId; Once a customer is created in the
	// database,
	// their ID cannot be modified. Changing the ID would lead to broken database
	// relationships.

	private int empId;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	/**
	 * The external developer must use the setter. If they try to set an invalid
	 * value , your method intercepts it, throws an exception, and prevents the
	 * object's internal state (salary) from ever becoming corrupted.
	 * 
	 * @param newSalary
	 */
	public void setSalary(double newSalary) {
		// 📢 ARCHITECTURAL CONTROL IS HERE 📢
		if (newSalary < 0 || newSalary > 1000000) {
			// Enforce business rule (e.g., salary cannot be negative or absurdly high)
			throw new IllegalArgumentException("Invalid salary amount. Must be between 0 and 1,000,000.");
		}
		// Only if validation passes, the change is made
		this.salary = newSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + ", empId=" + empId + "]";
	}

}
