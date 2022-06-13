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
		List<Course> courseList;
		
		return null;
	}

	@Override
	public void registerCourses(String studentID) throws SQLException {
		// TODO Auto-generated method stub
		
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
