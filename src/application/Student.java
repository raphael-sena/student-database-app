package application;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private Integer gradeYear;
	private String studentId;
	private String courses = null;
	private Integer tuitionBalance = 0;
	private static Integer costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompt user to enter student's name and year
	public Student() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = sc.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = sc.nextLine();

		System.out.println(
				"1 - Freshman" + "\n2 - Sophmore" + "\n3 - Junior" + "\n4 - Senior" + "\nEnter student class level: ");
		this.gradeYear = sc.nextInt();

		setStudentId();
	}

	// Generate an ID
	private void setStudentId() {
		// Grade level + ID
		id++;
		this.studentId = gradeYear + " " + id;
	}

	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		int pointer = 0;
		while (pointer == 0) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Do you want to leave? (Q to quit)");
			String leave = sc.nextLine();
			if (leave.equals("Q")) {
				System.out.println("BREAK!");
				pointer++;
			} else {
				System.out.println("Enter course to enroll: ");
				String course = sc.nextLine();

				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
		}
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	// Pay tuition
	public void payTuition () {
		Scanner sc = new Scanner(System.in);
		viewBalance();
		System.out.println("Enter your payment: ");
		int payment = sc.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
	}

	// Show status
	public String showInfo () {
		return "Student Name: " + firstName + lastName
				+ "\nGrade level: " + gradeYear
				+ "\nStudent ID: " + studentId
				+ "\nCourses: " + courses
				+ "\nBalance: " + tuitionBalance;
	}

}
