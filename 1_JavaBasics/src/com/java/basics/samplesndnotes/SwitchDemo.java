package com.java.basics.samplesndnotes;

public class SwitchDemo {

	public static void main(String[] args) {

		String day = "Sunday";
		switch (day.toUpperCase()) {
		case "SATURDAY":
		case "SUNDAY":
			System.out.println("Enjoying weekend");
			break;
		case "MONDAY":
			System.out.println("Gloomy days starting to work");
			break;
		case "FRIDAY":
			System.out.println("Waiting for weekend");
			break;
		case "THURSDAY":
		case "TUESDAY":
		case "WEDNESDAY":
			System.out.println("Busy Day");
			break;
		default:
			System.out.println("wrong choice");
		}

		/**
		 * : When dealing with numerous distinct, single-variable conditions, a
		 * $\text{switch}$ statement is far clearer and more concise than a long chain
		 * of $\text{if-else if-else}$ statements. Your example demonstrates this well:
		 * it immediately clarifies that the output depends entirely on the value of the
		 * day variable.
		 * 
		 * 
		 * The $\text{switch}$ statement is not just an alternative to $\text{if-else}$;
		 * it is the preferred choice for a clean, performant, and reliable
		 * implementation of multi-way conditional logic based on discrete values. As an
		 * architect, always encourage the use of $\text{switch}$ over complex
		 * $\text{if-else if}$ trees.
		 */

	}

}
