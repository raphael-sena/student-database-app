package application;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private Integer gradeYear;
	private String studentId;
	private String courses;
	private Integer tuitionBalance;
	private static Integer costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = sc.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = sc.nextLine();
		
		System.out.println("1 - Freshman"
				+ "\n2 - Sophmore"
				+ "\n3 - Junior"
				+ "\n4 - Senior"
				+ "\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		
		setStudentId();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
		
	
	}
	
	
	// Generate an ID
	private void setStudentId() {
		// Grade level + ID
		id++;
		this.studentId = gradeYear + " " + id;
	}
	
	// Enroll in courses
	
	// View balance 
	
	// Pay tuition
	
	// Show status
	
	
}
