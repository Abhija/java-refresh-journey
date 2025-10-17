package com.java.basics.assignments;

import java.util.Arrays;

//second largest in an array - LargeSecond.java 
public class LargeSecond {

	public static void main(String[] args) {
		int[] inputArray = { 3, 0, 3, 4, 10 };
		Arrays.sort(inputArray);
		System.out.println("Second Smallest number is " + inputArray[inputArray.length -2] );

	}

}
