/**
 * 
 */
package com.flipkart.services;
import java.sql.SQLException;
import java.util.*;
import com.flipkart.bean.*;
import com.flipkart.dao.*;


public class StudentImplementation implements StudentInterface{

	Database database;
	Scanner sc = new Scanner(System.in);
	public StudentImplementation(Database database) {
		this.database = database;
	}
	
	@Override
	public Student validateCredentials(String userId, String password) {
		
		for (Student student : database.studList) {
			
			if (student.getUserID().equals(userId) && student.getPassword().equals(password)) {
				System.out.println("verified");
				return student;
			}
		}
		
		return null;
	}

	@Override
	public List<Course> registeredCourseList(String studentId) throws SQLException {
		// TODO Auto-generated method stub
		
		Student student = null;
		for(Student studentTemp : database.studList) {
			if (studentTemp.getUserID().equals(studentId)) {
				student = studentTemp;
				break;
			}
		}
		
		if (student != null) {
			List<Course> courseList = student.getPreferences();
			return courseList;
		}
		
		return null;
	}

	@Override
	public void registerCourses(String studentID) throws SQLException {
		Student student = null;
		
		for (int j = 0;j<database.studList.size();j++) {
			if (database.studList.get(j).getUserID().equals(studentID)) student = database.studList.get(j);
		}
		
		// TODO Auto-generated method stub
		while(student.getPreferences().size()<6) {
			System.out.printf("Enter course preference number %d: ",student.getPreferences().size()+1);
			int courseTemp = sc.nextInt();
			
			
			Course preferedCourse = null;
			// verify if this course exists
			for (int j = 0;j<database.CourseList.size();j++) {
				if(database.CourseList.get(j).getCourseId() == courseTemp) {
					preferedCourse = database.CourseList.get(j);
					break;
				}
			}
			
			if (preferedCourse == null) {
				System.out.println("Invalid Course ID try again!");
			}
			
			// verify if this course if unique
			
			ArrayList<Course>coursePreferencesLocal = student.getPreferences();
			
			for (Course course : coursePreferencesLocal) {
				if (course.getCourseId() == courseTemp) {
					System.out.println("Already in prefereneces try entrying some other id.");
					preferedCourse = null;
					break;
				}
			}
			
			if (preferedCourse == null) {
				continue;
			}
			
			student.setPreferences(preferedCourse);
			
			for (int j = 0;j<database.studList.size();j++) {
				if (database.studList.get(j).getUserID().equals(studentID)) database.studList.set(j, student);
			}
			
		}
		
	}

	@Override
	public void viewGradeCard(String studentId) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> viewCourses() throws SQLException {
		// TODO Auto-generated method stub
		return database.CourseList;
		
	}
	
	
}
