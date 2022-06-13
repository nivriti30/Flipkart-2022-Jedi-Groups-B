package com.flipkart.services;

import com.flipkart.bean.*;
import java.util.*;

public interface AdminInterface {
	ArrayList<Admin> adminList=new ArrayList<>();
    public void addProfessor(Professor professor);
    public void addCourse(Course course);
    public void dropCourse(int courseId);
    public boolean approveStudents();
//    public void generateReportCard(String studentId);
}
