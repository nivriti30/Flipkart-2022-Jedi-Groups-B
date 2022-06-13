/**
 * 
 */
package com.flipkart.services;

import com.flipkart.bean.*;
import com.flipkart.dao.*;

/**
 * @author nivriti.pandey
 *
 */
public class AdminImplementation implements AdminInterface {

	Database db;
	
	public AdminImplementation(Database db) {
		super();
		this.db = db;
	}

	@Override
	public void addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		for(Professor prof:db.profList) {
			if(prof.getUserID().equals(professor.getUserID())) {
				System.out.println("UserID Already Exists");
				return;
			}
		}
		db.profList.add(professor);
		System.out.println("Professor Addition Successful");
	}

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		CourseInterface ci = new CourseImplementation(db);
		ci.addCourse(course);
	}

	@Override
	public void dropCourse(int courseId) {
		// TODO Auto-generated method stub
		CourseInterface ci = new CourseImplementation(db);
		ci.removeCourse(courseId);
	}

	@Override
	public boolean approveStudents() {
		// TODO Auto-generated method stub
		
		return false;
	}

}
