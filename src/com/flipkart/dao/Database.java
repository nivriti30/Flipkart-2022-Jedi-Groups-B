package com.flipkart.dao;
import java.util.ArrayList;
import java.util.HashMap;

import com.flipkart.bean.*;

public class Database {
	public ArrayList<Admin> adminList=new ArrayList<>();
	public ArrayList<Course> CourseList = new ArrayList<>();
	public HashMap<Integer,Course> hm_course_list=new HashMap<>();
	public ArrayList<Professor> profList=new ArrayList<>();
	public ArrayList<Student> studList=new ArrayList<>();
	public ArrayList<RegisteredCourse> registeredCourses = new ArrayList<>();
	public int phase = 1;
}
