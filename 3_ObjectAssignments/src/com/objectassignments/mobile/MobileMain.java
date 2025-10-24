package com.objectassignments.mobile;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("a", "a", "a");
		Mobile mobile2 = new Mobile("a", "a", "a");
		Mobile mobile3 = new Mobile("a", "a", "a");
		Mobile mobile4 = new Mobile("a", "a", "a");
		Mobile mobile5 = new Mobile("a", "a", "a");

		Mobile[] mobiles = { mobile1, mobile2, mobile3, mobile4, mobile5 };

		for (Mobile mobile : mobiles) {
			mobile.getDetails();
		}
	}

}
