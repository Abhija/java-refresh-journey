package com.srishti.training;

public class StrArryDemo {

	public static void main(String[] args) {
		String[] inputArray = new String[3];

		inputArray[0] = "Apple";
		inputArray[1] = "Orange";
		inputArray[2] = "Grapes";

		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i].toUpperCase());
		}
	}

}
