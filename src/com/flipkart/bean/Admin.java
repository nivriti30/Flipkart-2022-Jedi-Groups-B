package com.flipkart.bean;

public class Admin extends user{
	public String instituteName ;
	
	public Admin(String userID, String userName, String emailID, String password, String contactNo, String adminId,
			String instituteName) {
		super(userID, userName, emailID, password, contactNo);
		this.instituteName = instituteName;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	
}
