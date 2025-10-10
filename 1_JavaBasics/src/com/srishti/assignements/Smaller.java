package com.srishti.assignements;

public class Smaller {
	
	//Smallest in an array - Greater.java 
		public static void main(String[] args) {
			int[] inputArray = { 1, 2, 3, 4, 5 };

			int smallestNum = inputArray[0];
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] < smallestNum) {
					smallestNum = inputArray[i];
				}
			}
			
			System.out.println("Smallest number is " + smallestNum);

		}

}
