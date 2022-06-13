package com.flipkart.services;

import com.flipkart.bean.*;
import java.util.*;
import java.sql.SQLException;

public interface StudentInterface {
//	ArrayList<Student> studList=new ArrayList<>();
	
	public Student validateCredentials(String userId,String password);
	public List<Course> registeredCourseList(String studentId) throws SQLException;
    public void registerCourses(String studentID) throws SQLException;

    void viewGradeCard(String studentId) throws SQLException;

    public List<Course> viewCourses() throws SQLException;
    
}


