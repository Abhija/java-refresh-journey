package com.abstraction.assignments;


//Developer is a Team lead is not true, the example is not ideal 
public class Developer extends TeamLead {

	String[] hobbies;

	public Developer(String empName, double salary, int empId, String[] hobbies) {
		super(empName, salary, empId);
		this.hobbies = hobbies;
	}
	
	
	
	@Override
    void showProjects() {
        System.out.println("Developer Projects: Implementing API endpoints, Bug Fixes, Code Review.");
    }

    // Own method of Developer
    void showHobbies() {
        System.out.println("Developer Hobbies: " + String.join(", ", hobbies) + ".");
    }

}
