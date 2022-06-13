package com.flipkart.application;
import java.util.*;
import com.flipkart.services.*;
import com.flipkart.bean.*;

public class CRSApplication{
    public static void main(String args[]){
        int userType; // type of user is specified in this

        Scanner sc = new Scanner(System.in); // used for input

        while(true) {
            System.out.println("What are you?");
            System.out.println("1. Admin");
            System.out.println("2. Professor");
            System.out.println("3. Student");
            try {
            	userType = sc.nextInt();
            	switch (userType){
                case 1:
                    new AdminMenu();
                    break;
                case 2:
                    new ProfessorMenu();
                    break;
                case  3:
                    new StudentMenu();
                    break;
                default:
                    System.out.println("Invalid input try agian!!");
                    continue;
            	}
            	break;
            }
            catch(Exception e){
            	System.out.println("Wrong input type try putting an integer!!");
            	sc.nextLine();
            }
            
        }
    }
}