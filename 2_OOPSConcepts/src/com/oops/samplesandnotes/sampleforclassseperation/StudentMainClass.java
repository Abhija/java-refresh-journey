package com.oops.samplesandnotes.sampleforclassseperation;

//Calling class
public class StudentMainClass {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Ameya";
		student.studentID = 12;
		student.department = "Science";

		student.getDetails();
		
		int test = (int)student.getAverage(5, 2);
		System.out.println(test);
		
		double test2 = student.getAverage(5, 2);
		System.out.println(test2);
	}

}
