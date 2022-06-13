package com.flipkart.bean;

public class Notification {
	private int notificationId;
	private String studentId, message;
	
	
	public Notification(int notificationId, String studentId, String message) {
		super();
		this.notificationId = notificationId;
		this.studentId = studentId;
		this.message = message;
	}
	
	public int getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
