/**
 * 
 */
package com.flipkart.bean;

/**
 * @author gautam.manocha
 *
 */
public class RegisteredCourse {
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	private Professor professor;
	private Course course;
	
}
