package com.flipkart.bean;

public class user 
{
	private String userID;
	private String userName;
	private String emailID;
	private String Password;
	private String ContactNo;
	public user(String userID, String userName, String emailID, String password, String contactNo) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.emailID = emailID;
		Password = password;
		ContactNo = contactNo;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	
	

}
