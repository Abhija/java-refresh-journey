package com.java.basics.samplesndnotes;

public class TernaryOperator {

	public static void main(String[] args) {

		// condt?execute of true : execute if false

		int num = 10;
		String res = num > 100 ? "Num is greater" : "Num is smaller";
		System.out.println(res);

		int val = num > 100 ? ++num : num--;
		System.out.println(val);

	}

}
