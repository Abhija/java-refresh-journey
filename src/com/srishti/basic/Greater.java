package com.srishti.basic;

public class Greater {

	//Greatest in an array - Greater.java 
	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5 };

		int largestNum = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > largestNum) {
				largestNum = inputArray[i];
			}
		}
		
		System.out.println("Largest number is " + largestNum);

	}

}
