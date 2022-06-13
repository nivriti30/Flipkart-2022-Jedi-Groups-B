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
public class CourseImplementation implements CourseInterface {
	Database db;
	public CourseImplementation(Database db) {
		this.db=db;
	}
	@Override
	public void addCourse(int courseId, String courseName,double courseFee) {
		// TODO Auto-generated method stub
		if(db.hm_course_list.containsKey(courseId)) {
			System.out.println("Course Already Exists with the name "+db.hm_course_list.get(courseId).getCourseName());
			System.out.println("Please Try Again");
			return;
		}
	
		Course c = new Course(courseId,courseName,courseFee);
		db.CourseList.add(c);
		db.hm_course_list.put(courseId,c);
		System.out.println("Course Addition Successful");
	}

	@Override
	public void removeCourse(int courseId) {
		// TODO Auto-generated method stub
		if(db.hm_course_list.containsKey(courseId)) {
			db.CourseList.remove(db.hm_course_list.get(courseId));
			System.out.println("Course Deletion Successful");
			return;
		}
		System.out.println("Course Doesn't exist");
	}

	@Override
	public void viewAllCourses() {
		// TODO Auto-generated method stub
		for(Course c:db.CourseList) {
			System.out.println(c.getCourseId()+"  "+c.getCourseName());
		}
	}

}
