package com.flipkart.bean;

public class Professor extends user{
    private String areaOfExpertise;
    private int yearsOfExperience;
    
	public Professor(String userID, String emailID, String password, String contactNo,
			String professorId, String areaOfExpertise, int yearsOfExperience) {
		super(userID, emailID, password, contactNo);
		this.areaOfExpertise = areaOfExpertise;
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getAreaOfExpertise() {
		return areaOfExpertise;
	}
	public void setAreaOfExpertise(String areaOfExpertise) {
		this.areaOfExpertise = areaOfExpertise;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
    
    
}