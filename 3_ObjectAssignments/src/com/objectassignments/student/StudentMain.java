package com.objectassignments.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = scanner.nextLine();

		System.out.print("Enter department: ");
		String department = scanner.nextLine();

		Student student1 = new Student(name, department);

		System.out.print("Enter marks as comma seperated values: for student 1");
		String marks = scanner.nextLine();

		if (marks.contains(",")) {
			String[] marksArray = marks.split(",");
			int[] marksArrayInt = new int[marksArray.length];

			for (int i = 0; i < marksArray.length; i++) {
				System.out.print("Enter department: " + Integer.parseInt(marksArray[i].trim()));
				marksArrayInt[i] = Integer.parseInt(marksArray[i].trim());
			}

			student1.getGrades(marksArrayInt);
			scanner.close();

		}else {
			System.out.println("Enter comma seperaetd data");
		}

		student1.printDetails();

	}

}
