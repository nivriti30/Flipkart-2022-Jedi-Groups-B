/**
 * 
 */
package com.flipkart.services;
import com.flipkart.bean.*;

/**
 * @author nivriti.pandey
 *
 */
public class CourseImplementation implements CourseInterface {

	@Override
	public void addCourse(int courseId, String courseName) {
		// TODO Auto-generated method stub
		if(hm_course_list.containsKey(courseId)) {
			System.out.println("Course Already Exists with the name "+hm_course_list.get(courseId).getCourseName());
			System.out.println("Please Try Again");
			return;
		}
		
		Course c = new Course(courseId,courseName);
		CourseList.add(c);
		hm_course_list.put(courseId,c);
		System.out.println("Course Addition Successful");
	}

	@Override
	public void removeCourse(int courseId) {
		// TODO Auto-generated method stub
		if(hm_course_list.containsKey(courseId)) {
			CourseList.remove(hm_course_list.get(courseId));
			System.out.println("Course Deletion Successful");
			return;
		}
		System.out.println("Course Doesn't exist");
	}

	@Override
	public void viewAllCourses() {
		// TODO Auto-generated method stub
		for(Course c:CourseList) {
			System.out.println(c.getCourseId()+"  "+c.getCourseName());
		}
	}

}
