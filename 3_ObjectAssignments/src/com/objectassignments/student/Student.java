package com.objectassignments.student;

public class Student {

	String name;
	String department;
	double totalMarks;
	double totalAverage;
	String grade;

	public Student(String name, String department) {
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("Student [name=" + name + ", department=" + department + ", totalMarks=" + totalMarks
				+ ", totalAverage=" + totalAverage + ", grade=" + grade + "]");
	}

	String getGrades(int[] marks) {

		if (null != marks && marks.length <= 0) {
			return "No marks entered";
		}
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		this.totalMarks = sum;

		double average = sum / marks.length;
		this.totalAverage = average;

		String grade = "";
		if (average >= 90) {
			this.grade = "A (90-100)";
		} else if (average >= 80) {
			this.grade = "B (80-89)";
		} else if (average >= 70) {
			this.grade = "C (70-79)";
		} else if (average >= 60) {
			this.grade = "D (60-69)";
		} else if (average >= 50) {
			this.grade = "E (50-59)";
		} else if (average <= 50) {
			System.out.println("Entered");
			this.grade = "Fail (< 50)";
		}

		System.out.println(this.grade);
		return "Sum of marks is " + sum + " Average of marks is" + average;
	}

}
