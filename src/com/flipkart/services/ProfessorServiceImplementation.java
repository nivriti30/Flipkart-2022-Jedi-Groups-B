/**
 * 
 */
package com.flipkart.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.flipkart.bean.*;
import com.flipkart.dao.*;


/**
 * @author nivriti.pandey
 *
 */
public class ProfessorServiceImplementation implements ProfessorServiceInterface {
	Database db;
	
	public ProfessorServiceImplementation(Database db) {
		super();
		this.db = db;
	}

	@Override
	public ArrayList<Course> viewAllCourses() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		CourseInterface ci = new CourseImplementation(db);
		return ci.viewAllCourses();
	}

	@Override
	public void registerCourses(Professor professor) throws SQLException, IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, ArrayList<String>> viewEnrolledStudents(Professor professor) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assignGrades(Professor professor) throws SQLException, IOException {
		// TODO Auto-generated method stub

	}

}
