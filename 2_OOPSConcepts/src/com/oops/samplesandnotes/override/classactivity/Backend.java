package com.oops.samplesandnotes.override.classactivity;

public class Backend extends Course {

	@Override
	void printDetails() {
		System.out.println("Backend Coaching");

	}

	@Override
	String[] getCourses() {
		String[] courses = { "Java", "Springboot" };
		return courses;
	}

}
