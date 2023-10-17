package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;  // Import the Scanner class

public class MainClass {
	public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

		// Todo 7: Create two classes for Freshman and Senior

		// ToDo 8: The senior class should have a minimum of 85 credits

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

		Scanner scanner = new Scanner(System.in);  // Create a Scanner object

		System.out.print("Enter student name: ");
		String name = scanner.nextLine();

		System.out.print("Enter student age: ");
		short age = scanner.nextShort();

		System.out.print("Enter student GPA: ");
		double gpa = scanner.nextDouble();

		Student std1 = new Student(name, age, gpa);

		System.out.print("Enter freshman name: ");
		name = scanner.next();
		System.out.print("Enter freshman age: ");
		age = scanner.nextShort();
		System.out.print("Enter freshman GPA: ");
		gpa = scanner.nextDouble();

		Freshman fresh1 = new Freshman(name, age, gpa);

		System.out.print("Enter senior name: ");
		name = scanner.next();
		System.out.print("Enter senior age: ");
		age = scanner.nextShort();
		System.out.print("Enter senior GPA: ");
		gpa = scanner.nextDouble();
		System.out.print("Enter senior credits: ");
		int credits = scanner.nextInt();

		Senior std2 = new Senior(name, age, gpa, credits);

		scanner.close();  // Close the scanner when done

		// ToDo 12: Set the GPA of the student using the scanner and user
		//          input and then print the output.

		System.out.println(std1);
		System.out.println(fresh1);
		System.out.println(std2);

		// ToDo 13: add comments and explain your code
	}
}
