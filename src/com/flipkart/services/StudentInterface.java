package com.flipkart.services;

import com.flipkart.bean.*;
import java.util.*;
import java.sql.SQLException;

public interface StudentInterface {
	public Student validateCredentials(String userId,String password);
	public void registeredCourseList(String studentId) throws SQLException;
    public void registerCourses(String studentID) throws SQLException;

    void viewGradeCard(String studentId) throws SQLException;

    public List<Course> viewCourses() throws SQLException;
}


