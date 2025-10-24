package com.java.basics.assignments;

public class Sum {
	// Print the sum and avg of all digits in array - Sum.java
	public static void main(String[] args) {
		int[] inputArray = new int[4];

		inputArray[0] = 1;
		inputArray[1] = 3;
		inputArray[2] = 20;
		inputArray[3] = 1;

		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i] * inputArray[i]);
		}

		System.out.println("Sum is " + sum);
		System.out.println("Average is" + sum / (inputArray.length));

	}

}
