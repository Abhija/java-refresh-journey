package com.java.basics.samplesndnotes;

public class CmdDemo {

	public static void main(String[] args) {
		System.out.println(args[0]);
		// This will show error, because the args are supposed to be passed in java
		// calls

		/**
		 * The method signature public static void main(String[] args) is the entry
		 * point for any standalone Java application.
		 * 
		 * String[] args is a parameter that represents an array of strings. Each
		 * element in this array corresponds to an argument passed on the command line
		 * when the program is launched.
		 * 
		 * 
		 * Passing Arguments: When you run a Java program from the command line, any
		 * words you type after the class name are treated as arguments. For example
		 */
		String name = args[0];
		System.out.println("Name " + name);

		// In eclipse the arguments can be passed through Run configurations
		// Arguments = variables = String prompt
		// After that each time when we run the app the prompt will come
		/**
		 * In practical apps, instead of the argumets. We may setup the common
		 * properties in System properties System Properties (-D) are the standard,
		 * enterprise-level way to pass environment-specific, global configuration to a
		 * Java application or framework, completely bypassing the need for you to write
		 * an explicit $\text{main}$ method to handle the parsing of $\text{String[]
		 * args}$. The framework handles that complexity for you.
		 * 
		 * This is passed as VM arguments in application
		 */

	}

}
