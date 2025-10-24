package com.java.basics.assignments;

import java.util.Arrays;


//second smallest in an array - SmallSecond.java 
public class SmallSecond {
	public static void main(String[] args) {
		int[] inputArray = { 3, 0, 3, 4, 1 };
		Arrays.sort(inputArray);
		System.out.println("Second Smallest number is " + inputArray[1]);

	}

}
