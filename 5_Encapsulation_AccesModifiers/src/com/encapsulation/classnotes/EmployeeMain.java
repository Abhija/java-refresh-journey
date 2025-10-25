package com.encapsulation.classnotes;

public class EmployeeMain {

	public static void main(String[] args) {

		/**
		 * // Example: The field is public (Bad Practice) public double salary;
		 * 
		 * // Any class can directly bypass all logic: myEmployee.salary = 999999999.0;
		 * // No check for maximum value myEmployee.salary = -100.0; // No check for
		 * negative value
		 * 
		 * 
		 * The external developer is free to assign any value, regardless of your
		 * application's business rules. You lose control over the object's state
		 * integrity.
		 */

		/**
		 * ' public List<String> getPhoneNumbers() { // Return a NEW list containing a
		 * copy of the elements. // The external class gets its own copy to play with,
		 * protecting the original. return new ArrayList<>(this.phoneNumbers); }
		 * 
		 * To maintain encapsulation, the getter must return a defensive copy of the
		 * internal mutable object.
		 * 
		 * For mutable objects (like $\text{Lists}$, $\text{Maps}$, custom
		 * $\text{POJOs}$), the getter must never return a direct reference. This is a
		 * critical security and integrity check for senior-level engineers and
		 * architects.
		 */
		
		Employee employee = new Employee();
		employee.setEmpName("Abhija");
		employee.setEmpId(10);
		employee.setSalary(2000);
		
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getSalary());
		System.out.println(employee);

	}
}
