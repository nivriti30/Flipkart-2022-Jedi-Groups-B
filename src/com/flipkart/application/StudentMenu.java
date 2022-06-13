package com.flipkart.application;

import java.util.*;

import com.flipkart.bean.*;
import com.flipkart.services.*;
 

public class StudentMenu {
	public StudentMenu() {
		int menuFlag; // used to determine the task to be done
		StudentImplementation studentImplementation = new StudentImplementation(); // used to call student functions
		
		String userIdLocal; // used to take userid as input
		String passwordLocal;// used to take password as input
		Student student = null; // object of student
		int phase = 1; // what phase  of system is going on
		List<Course> courseList;
		
		Scanner sc = new Scanner(System.in);
		try {
		while(true) {
			System.out.println("____________________________");
			System.out.println("1. Login\n2. Quit");
			
			
			
			
				menuFlag = sc.nextInt();
			
			
			switch(menuFlag) {
			case 1: 
				
				
				// user id input
				System.out.print("Enter your username: ");
				userIdLocal = sc.next();
				// password input
				System.out.print("Enter your password: ");
				passwordLocal = sc.next();
				
				student = studentImplementation.validateCredentials(userIdLocal,passwordLocal);
				
				if (student == null) {
					System.out.println("Invalid credentials!!");
					continue;
				}
				break;
			case 2:
				System.exit(0);
			default:
				System.out.println("Enter a valid input!!");
				continue;
		
				
			}
			break;
			
			
		}
		
		// student is logged in here
		
		switch(phase) {
			case 1: // before semester start
				System.out.println("1. View Course List\n2. Register Courses\nAny other input depicts logout!");
				int registerFlag = sc.nextInt();
				
				if (registerFlag == 1) 
				{
						courseList = studentImplementation.viewCourses();
						System.out.println("Course Id\tCourse Name\tCourse Fee");
						for (Course courses: courseList) System.out.printf("%d\t"+courses.getCourseName()+"\t%f\n",courses.getCourseId(),courses.getCourseFee());
				}
				
				else if (registerFlag == 2) studentImplementation.registerCourses(student.getUserID());
				
				else System.exit(0);
				break;
			case 2: // fee payment
				
				break;
			case 3: // during semester
				System.out.println("Enter 1 to see registered courses any other input depicts logout!!");
				int viewCoursesFlag = sc.nextInt();
				if (viewCoursesFlag!=1) System.exit(0);
				
				courseList = studentImplementation.registeredCourseList(student.getUserID());
				System.out.println("Course Id\tCourse Name\tCourse Fee");
				for (Course courses: courseList) System.out.printf("%d\t"+courses.getCourseName()+"\t%f\n",courses.getCourseId(),courses.getCourseFee());
				break;
			case 4: // after semester
				System.out.println("Enter 1 to see registered courses any other input depicts logout!!");
				int viewGradeSheetFlag = sc.nextInt();
				if (viewGradeSheetFlag!=1) System.exit(0);
				
				studentImplementation.viewGradeCard(student.getUserID());
				break;
		}
		}
		catch(Exception e) {
			System.out.println("Enter input in correct data type!");
			sc.nextLine();
		}
	}
}
