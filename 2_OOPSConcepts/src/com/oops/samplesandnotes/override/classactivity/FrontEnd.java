package com.oops.samplesandnotes.override.classactivity;

public class FrontEnd extends Course {

	@Override
	void printDetails() {
		System.out.println("FrontEnd Coaching");

	}

	@Override
	String[] getCourses() {
		String[] courses = { "HTML", "Angular" };
		return courses;
	}

}
