package com.java.basics.samplesndnotes;

public class TypeCasting {

	public static void main(String[] args) {
		float g = 12.5f;
		byte b = 100;
		int x = b * 2; // upcasting
		long y = x + 2; // upcasting
		float a = x + y + b;
		double num = a * 2;
		System.out.println(num);

		// downcasting
		float num1 = (float) (num / 2);
		long num2 = (long) (num1 + 10);
		int num3 = (int) (num2 / 2);
		System.out.println(num3);

		/**
		 * Prioritize Widening: Always structure calculations to use the wider type
		 * first to prevent unintended loss of precision (e.g., use 12.5 instead of 12
		 * if you need floating-point accuracy).Avoid Narrowing: Explicit casts should
		 * be minimized and only used when you are absolutely certain that the larger
		 * value fits within the smaller type (e.g., when converting a database record
		 * ID that you know is an int back from a generic long).Alternative: When
		 * converting between types, especially for user input or database results,
		 * prefer using the methods provided by Wrapper Classes (e.g.,
		 * $\text{Integer.parseInt()}$ or $\text{Long.valueOf()}$) over simple casts, as
		 * these methods often provide better error handling or clearer intent.
		 */
	}

}
