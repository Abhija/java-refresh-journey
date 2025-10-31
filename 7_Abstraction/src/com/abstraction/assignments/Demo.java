package com.abstraction.assignments;

import java.util.Arrays;

public class Demo {

	/**
	 * you cannot create an object (instantiate) directly from any class declared
	 * with the abstract keyword.
	 */
	// Employee employee = new Employee();

	public static void main(String[] args) {

		Employee employee = new Manager("Abhija Jayan", 1200, 101, "TATA Trust charity");

		employee.calcBonus(5000.0);

		employee.showProjects();

		System.out.println("Courses: " + Arrays.toString(employee.showCourses()));

		// Rule is for every one and cannot be overridden
		employee.showRules();

		// This cannot be called, we can't call child own methods with parent refereve
		// employee.funClub();

		// Downcasting to refer the child method
		Manager managerObj = (Manager) employee;
		managerObj.funClub();

		// Parents own methods can be called with Child reference
		managerObj.showRules();

		// Use super class reference = subclass object (Polymorphism)
		Employee developer = new Developer("Kukku", 85000.0, 201, new String[] { "Watching reel", "Gardening" });

		// The overridden methods at any point in between can be called
		developer.calcBonus(3000.0);

		developer.showProjects();

		developer.showRules();

//		developer.corporateServices();

		TeamLead teamLead = (TeamLead) developer;
		teamLead.corporateServices();

		Developer developerObj = (Developer) developer;
		developerObj.showHobbies();
	}

}
