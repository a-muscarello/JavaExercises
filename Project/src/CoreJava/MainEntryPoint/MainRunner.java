package CoreJava.MainEntryPoint;

import java.util.List;
import java.util.Scanner;

import CoreJava.DAO.AttendingDAO;
import CoreJava.DAO.CourseDAO;
import CoreJava.DAO.StudentDAO;
import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;

public class MainRunner {

	public static void main(String[] args) {
		
		System.out.println("Are you a(n)");
		System.out.println("1. Student");
		System.out.println("2. Quit");
		System.out.println("Answer: ");
		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		
		if (answer == 1) {
			StudentDAO studentDAO = new StudentDAO();
			List <Student> studentList = studentDAO.getStudents();
			System.out.println("Enter your email: ");
			String email = in.nextLine();
			System.out.println("Enter your password: ");
			String password = in.nextLine();
			
			if (studentDAO.validateUser(studentList, email, password)) {
				CourseDAO courseDAO = new CourseDAO();
				AttendingDAO attendingDAO = new AttendingDAO();
				Student student = studentDAO.getStudentByEmail(studentList, email);
				List <Course> courseList = courseDAO.getAllCourses();
				List <Attending> attendingList = attendingDAO.getAttending();
				
				myClasses (student, courseList, attendingList);
				
				System.out.println("What would you like to do? ");
				System.out.println("1. Register for a new class. ");
				System.out.println("2. Log out. ");
				System.out.println("Answer: ");
				answer = in.nextInt();
				
				if (answer == 1) {
					
					allClasses(courseList);
					System.out.println("Select course by ID number: ");
					int courseID = in.nextInt();
					System.out.println("Attempting to register ... ");
					attendingDAO.registerStudentToCourse(attendingList, student.getEmail(), courseID);
				}
				
				System.out.println("Logging out ...");
			}
			else {
				System.out.println("Invalid email or password ...");
			}
		}
		System.out.println("Closing program. Goodbye. ");
	}
	
	public static void myClasses (Student student, List <Course> courseList, List <Attending> attendingList) {
		System.out.println("My classes: ");
		System.out.printf("%-5s | %-25s | %-25s", "#", "COURSE NAME", "INSTRUCTOR NAME");
		
		AttendingDAO attendingDAO = new AttendingDAO();
		List <Course> courses = attendingDAO.getStudentCourses(courseList, attendingList, student.getEmail());
		
		for (Course course : courses) {
			System.out.printf("%-5s | %-25s | %-25s", course.getID(), course.getName(), course.getInstructor());
		}
	}
	
	public static void allClasses(List <Course> courseList) {
		System.out.println("My classes: ");
		System.out.printf("%-5s | %-25s | %-25s", "#", "COURSE NAME", "INSTRUCTOR NAME");
		
		for (Course course : courseList) {
			System.out.printf("%-5s | %-25s | %-25s", course.getID(), course.getName(), course.getInstructor());
		}
	}
}






