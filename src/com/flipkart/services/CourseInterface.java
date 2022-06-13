package com.flipkart.services;
import com.flipkart.bean.*;
import java.util.*;

public interface CourseInterface {
//	ArrayList<Course> CourseList = new ArrayList<>();
//	HashMap<Integer,Course> hm_course_list=new HashMap<>();
	public void addCourse(Course c);
	public void removeCourse(int CourseId);
	public void viewAllCourses();
}
