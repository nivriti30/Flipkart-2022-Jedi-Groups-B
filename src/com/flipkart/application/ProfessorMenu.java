package com.flipkart.application;
import java.util.ArrayList;
import java.util.Scanner;

import com.flipkart.bean.*;
import com.flipkart.services.*;

public class ProfessorMenu 
{
	Professor prof ;
	
	public ProfessorMenu() {
		String userID, userName,  emailID,  password, contactNo, professorId, areaOfExpertise;
		int yearsOfExperience ;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter UserId") ;
		userID = sc.nextLine() ;
		System.out.println("Enter UserName") ;
		userName = sc.nextLine() ;
		System.out.println("Enter emailId") ;
		emailID = sc.nextLine() ;
		System.out.println("Enter Password") ;
		password = sc.nextLine() ;
		System.out.println("Enter contactNo.") ;
		contactNo = sc.nextLine() ;
		System.out.println("Enter professorId") ;
		professorId = sc.nextLine() ;
		System.out.println("Enter area of expertise") ;
		areaOfExpertise = sc.nextLine() ;
		System.out.println("Years of experience") ;
		yearsOfExperience = sc.nextInt() ;
		prof = new Professor( userID, userName, emailID, password, contactNo,professorId, areaOfExpertise,yearsOfExperience) ;
	
		
	}
	public void ProfOptions()
	{
		int d = 1 ;
		int choice ;
		while(d != 0)
		{
			
		}
	}
}
