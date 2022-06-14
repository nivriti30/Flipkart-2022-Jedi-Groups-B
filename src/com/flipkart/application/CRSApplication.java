package com.flipkart.application;
import java.util.*;
import java.io.*;
import com.flipkart.services.*;
import com.flipkart.bean.*;
import com.flipkart.dao.*;

public class CRSApplication{
	
	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	private Database database;
	
	public void addDummyData() {
		FileReader fr = null;
		try {
			
			fr = new FileReader("./src/student.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line = br.readLine())!=null)
		{
			String[] temp = line.split(",",100);
			this.database.studList.add(new Student(temp[0],temp[1],temp[2],temp[3],Integer.parseInt(temp[4]),temp[5],temp[6],Boolean.parseBoolean(temp[7])));
		}
		fr.close();
		
		fr = new FileReader("./src/admin.txt");
		
		br = new BufferedReader(fr);
		
		while((line = br.readLine())!=null)
		{
			String[] temp = line.split(",",100);
			this.database.adminList.add(new Admin(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]));
		}
		fr.close();
		
		
		fr = new FileReader("./src/prof.txt");
		
		br = new BufferedReader(fr);
		
		while((line = br.readLine())!=null)
		{
			String[] temp = line.split(",",100);
			this.database.profList.add(new Professor(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5], Integer.valueOf(temp[6])));
		}
		fr.close();
		
		
		fr = new FileReader("./src/course.txt");
		
		br = new BufferedReader(fr);
		
		while((line = br.readLine())!=null)
		{
			String[] temp = line.split(",",100);
			this.database.CourseList.add(new Course(Integer.valueOf(temp[0]),temp[1],Double.valueOf(temp[2])));
		}
		fr.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public CRSApplication(Database database) {
		this.database = database;
		addDummyData();
	}
	
	
    public static void main(String args[]){
    	
    	CRSApplication app = new CRSApplication(new Database()); // my app
    	
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
                    new ProfessorMenu(app.database);
                    break;
                case  3:
                    new StudentMenu(app.database);
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