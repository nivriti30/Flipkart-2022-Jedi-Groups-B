package com.flipkart.bean;

import java.util.ArrayList;

public class Student extends user{

    private int semester;
    private String grade;
    private String feeStatus;
    private boolean isApproved;
    private ArrayList<Course> preferences = new ArrayList<>();
    

	public ArrayList<Course> getPreferences() {
		return preferences;
	}

	public void setPreferences(Course course) {
		this.preferences.add(course);
	}

	public Student(String userID,String emailID, String password, String contactNo,
			int semester, String grade, String feeStatus, boolean isApproved) {
		super(userID, emailID, password, contactNo);
		this.semester = semester;
		this.grade = grade;
		this.feeStatus = feeStatus;
		this.isApproved = isApproved;
	}
	
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getFeeStatus() {
		return feeStatus;
	}
	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
    
}