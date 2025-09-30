package com.srishti.basic;

public class Sum {
	// Print the sum and avg of all digits in array - Sum.java
	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5 };

		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
		}

		System.out.println("Sum is " + sum);
		System.out.println("Average is" + sum / (inputArray.length));

	}

}
