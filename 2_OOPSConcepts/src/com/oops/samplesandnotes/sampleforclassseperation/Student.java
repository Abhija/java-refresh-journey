package com.oops.samplesandnotes.sampleforclassseperation;

public class Student {

	String name;

	int studentID;

	String department;	
	
	//This is not considered as constructor
	void Student(){
		
	}
	
	Student(String empName, int id, String department ){
		name = empName;
		studentID = id;
		//The local variable is given first preference
		//department = department;
		//Here the instance variable is taken
		//Constructors always use the same variable name as good coding practice
		this.department = department;
	}
	
	
	

	//Constructor doesn't have a return type
	//If we don't create, then the default constructor will be used
	//A class can have multiple constructors with different parameters
	
	public Student() {
		super();
	}

	double getAverage(int num1, int num2) {
		
		int sum = num1+num2;
		double average = sum/2;
		return average;
		
	}
	

    /*
     * WHY USE 'this' KEYWORD HERE?
     * -----------------------------
     * 1. Clarity (Primary Reason here) 📖: It explicitly shows that you are
     * accessing the instance fields (the object's state) vs. a local variable.
     *
     * 2. Preventing Shadowing (Most Common General Use) 🛡️:
     * It is REQUIRED when a method parameter or local variable has the same name
     * as an instance field (e.g., in a constructor like: this.name = name;).
     * In getDetails(), it is optional but adds clarity.
     */
	
	void getDetails() {
		System.out.println("Student [name=" + this.name + ", studentID=" + this.studentID + ", department="
				+ this.department + "]");
	}

}
