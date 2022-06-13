package com.flipkart.services;

import com.flipkart.bean.*;

public interface AdminInterface {
    public void addProfessor(Professor professor);
    public void addCourse(Course course);
    public void dropCourse(int courseId);
    public boolean approveStudents();
//    public void generateReportCard(String studentId);
}
