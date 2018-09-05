package CoreJava.DAO;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CoreJava.Models.Student;


public class StudentDAO {
	
//	Scanner in = new Scanner(System.in);
//	int answer = in.nextInt();
	
	//getAllStudent
	public List <Student> getStudents () {
		
		getStudents(students.csv);
		return answer;
		
	}
	
	public String getStudentByEmail (List <Student> studentList, String studentEmail) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String email = in.nextLine();
		return email;
		
	}
	
	public boolean validateUser (List <Student> studentList, String studentEmail, String studentPass) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String password = in.nextLine();
		
		if (studentPass == password)
			System.out.println("Welcome.");
		else {
			System.out.println("Incorrect username or password.");
		}
		return false;
	}
	
}

