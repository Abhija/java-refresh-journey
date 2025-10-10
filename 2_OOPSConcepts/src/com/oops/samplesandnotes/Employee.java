package com.oops.samplesandnotes;

public class Employee {

	String empName;
	// The 'empName' variable exists on the stack, but it holds NO memory address
	// yet.
	// It's uninitialized and cannot be used.
	
	//These are instance variables
	int empID;
	double salary;

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("Employee id is " + emp.empID + "Employee name " + emp.empName + "Salary " + emp.salary);

		/*
		 * What really happens when the 'new' keyword is used:
		 *
		 * 1. Allocation 🧠: Memory is allocated on the **Heap** for the new Employee
		 * object. The size of this memory is determined by the class's instance
		 * variables (empName, empID, salary).
		 *
		 * 2. Initialization 💡: All instance variables are initialized to their
		 * **default values** (e.g., empName = null, empID = 0, salary = 0.0).
		 *
		 * 3. Constructor Call 🔨: The **constructor** is executed. It performs any
		 * custom setup or overrides the default values (e.g., if you had 'new
		 * Employee("Bob")').
		 *
		 * 4. Reference Return 🔗: The **memory address** (reference) of the newly
		 * created object is returned and assigned to the variable (e.g., 'myEmployee').
		 */

		emp.empID = 23;
		emp.empName = "Alice";
		emp.salary = 9000;
		System.out.println("Employee id is " + emp.empID + " Employee name " + emp.empName + "Salary " + emp.salary);
		Employee emp2 = new Employee();
		emp2.empID = 33;
		emp2.empName = "Bob";
		emp2.salary = 12000;
		System.out.println("Employee id is " + emp2.empID + " Employee name " + emp2.empName + "Salary " + emp2.salary);

		Employee emp3 = emp2;
		// Multiple references are pointing to the same object in the memory
		// Analogy of two people watching same television with a remote
		// If one changes the channel, the second person is also affected
		// Similary both these variables are storing the same reference , So if
		// emp3.name = "Alice" , it will change emp2.name = "Alice"
		System.out.println("Employee name " + emp2.empName);
		System.out.println("Employee name " + emp3.empName);
		emp2.empName = "Alice";
		// Output
		// Employee name Bob
		// Employee name Bob
		System.out.println(emp2);
		System.out.println(emp3);
		// Output
		// com.oops.samplesandnotes.Employee@6f539caf
		// com.oops.samplesandnotes.Employee@6f539caf
		// The reference variable holds the reference
		// The Reference is the address that tells the JVM where on the Heap that object
		// resides.
		System.out.println("Employee name " + emp2.empName);
		System.out.println("Employee name " + emp3.empName);
		// Output
		// Employee name Alice
		// Employee name Alice
		emp2 = null;
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println("Employee name " + emp2.empName); // Null pointer exception
		System.out.println("Employee name " + emp3.empName);
		/**
		 * Exception in thread "main" java.lang.NullPointerException: Cannot read field
		 * "empName" because "emp2" is null at
		 * OOPSExamples/com.oops.Employee.main(Employee.java:56)
		 */

		/**
		 * Instance Variables (like empName, empID, salary within the Employee class):
		 * The reference is stored inside the object, which is itself on the Heap.
		 * 
		 * Local Variables (declared inside a method): The reference is stored on the
		 * Stack.
		 * 
		 * The Object itself is always on the Heap.
		 * The Reference is the address that tells the JVM where on the Heap that object resides.
		 */

	}
}
