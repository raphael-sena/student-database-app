package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		// Ask how many students we want to add
		System.out.println("Enter number of new students to enroll: ");
		int numberOfStudents = sc.nextInt();
		Student[] student = new Student[numberOfStudents];
		
		// Create a number of new students
		for (int i = 0; i < numberOfStudents; i++) {
			student[i] = new Student();
			student[i].enroll();
			student[i].payTuition();
		}
		
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println(student[i].showInfo());
		}
		
		
		sc.close();
	}

}
