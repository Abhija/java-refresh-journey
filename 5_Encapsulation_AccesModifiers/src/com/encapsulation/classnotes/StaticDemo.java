package com.encapsulation.classnotes;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class StaticDemo {

	static int x;
	static int y = 100;
	static {
		System.out.println("in static block");
		x = 30;
		System.out.println(x + y);
	}

	StaticDemo() {
		System.out.println("Great");
	}

	void call() {
		System.out.println("Helloo!");
	}

	public static void main(String[] args) {
//		StaticDemo demo = new StaticDemo();
//		System.out.println("in main");
//		demo.call();

//		System.out.println(x + y);

		/// Calling Student class
		
		//static bloack is called
//		Student student = new Student();

//		out.println("main");
		Student.call();
		System.out.println(Student.subjects);
//
//		int x = parseInt("100");
//		System.out.println(x);
		;

	}

}
