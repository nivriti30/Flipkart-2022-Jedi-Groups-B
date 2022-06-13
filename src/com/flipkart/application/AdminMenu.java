package com.flipkart.application;
import java.net.StandardSocketOptions;
import java.util.*;
import com.flipkart.services.*;
import com.flipkart.bean.*;
import com.sun.tools.jconsole.JConsoleContext;
import com.sun.tools.jconsole.JConsolePlugin;


public class AdminMenu {

	// 1st task
	// instantiate admin obj
	AdminInterface admin;
	AdminMenu(){
		String userID, userName, emailID, password, contactNo, adminId, institudeName;
		int yearsOfExperience;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter User ID");
		userID = sc.nextLine();

		System.out.println("enter User Name");
		userName = sc.nextLine();

		System.out.println("enter email ID");
		emailID = sc.nextLine();

		System.out.println("enter password");
		password = sc.nextLine();

		System.out.println("enter contact");
		contactNo  = sc.nextLine();

		System.out.println("enter admin ID");
		adminId = sc.nextLine();

		System.out.println("enter institute name");
		institudeName = sc.nextLine();

		System.out.println("Enter years of exp");
		yearsOfExperience = sc.nextInt();




	}

	public void addProff(){
		String userID, userName, emailID,password,  contactNo, professorId, areaOfExpertise;
		int yearsOfExperience;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserId");
		userID = sc.nextLine();

		System.out.println("Enter UserName");
		userName = sc.nextLine();

		System.out.println("Enter EmailID");
		emailID = sc.nextLine();

		System.out.println("Enter Password");
		password = sc.nextLine();

		System.out.println("Enter Contact No");
		contactNo = sc.nextLine();

		System.out.println("Enter Proff Id");
		professorId = sc.nextLine();

		System.out.println("Enter area of expertise");
		areaOfExpertise = sc.nextLine();

		System.out.println("Enter years of experience");
		yearsOfExperience = sc.nextInt();

		admin.addProfessor(new Professor(
				userID , userName , emailID , password , contactNo , professorId , areaOfExpertise , yearsOfExperience
		)); // Admin is obj of type admin


	}
	public void adminOptions() {
		int choice;
		int d=1;


		while(d!=0) {
			System.out.println("Enter your choice : ");
            System.out.println("1. Add Professor");
            System.out.println("2. Add Course");
            System.out.println("3. Drop Course");
            System.out.println("4. Approve Pending Students");
            System.out.println("5. Exit");
            Scanner s = new Scanner(System.in);
            
            choice = s.nextInt();
            
            switch(choice) {
            	case 1://Professor
					addProff();
            		break;
            	case 2://Add Course
            		break;
            	case 3://Drop Course
            		break;
            	case 4://Approve Pending Students
            		break;
            	case 5://Exit
            		d=0;
            		break;	
            	
            	default:
            		System.out.println("Invalid Choice");
            }
            
		}
	}
}
