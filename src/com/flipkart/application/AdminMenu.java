package com.flipkart.application;
import java.util.*;
import com.flipkart.services.*;
import com.flipkart.bean.*;

public class AdminMenu {
	
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
            Scanner s= new Scanner(System.in);
            
            choice=s.nextInt();
            
            switch(choice) {
            	case 1://Add Professor
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
