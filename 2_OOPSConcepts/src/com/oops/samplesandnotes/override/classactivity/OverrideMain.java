package com.oops.samplesandnotes.override.classactivity;

public class OverrideMain {

	public static void main(String[] args) {
		Course course = new FrontEnd();
		course.printDetails();
		String[] courses = course.getCourses();
		System.out.println("Courses offered are");
		for (String courseName : courses) {
			System.out.println(courseName);
		}
		
		course = new Backend();
		course.printDetails();
		courses = course.getCourses();
		System.out.println("Courses offered are");
		for (String courseName : courses) {
			System.out.println(courseName);
		}
	}

}
