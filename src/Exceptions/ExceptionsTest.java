package Exceptions;

import java.util.Scanner;

public class ExceptionsTest {
	
//	public static void main(String[] args) {
//		int x;
//		int y;
//		int z;
//		
//		try {
//			System.out.println("What is your first number: ");
//			Scanner scanner = new Scanner(System.in);
//			x = scanner.nextInt();
//			
//			System.out.println("What is your second number: ");
//			y = scanner.nextInt();
//			
//			System.out.println("the sum of the input is " + (x+y));
//			
//			System.out.println("the division of the input is " + (x/y));
//			
//			System.out.println("the total of the input of " + (1 + (x*y)));
//		}
//		// e - base-class exception when you dont know what type of exception to look out for
//		catch(Exception e) {
//			System.out.println(e);
//			//System.out.println(e.toString()); => gives the exception type
//		}	// specific type of exception you're handling like arithmetic/ InputMismatchedException etc
////		catch(ArithmeticException e2) {
//			
//		}
//		
//	}
//}
	
	
	
	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		try {
			System.out.println("What is your first number: ");
			Scanner scanner = new Scanner(System.in);
			x = scanner.nextInt();
			
			System.out.println("What is your second number: ");
			y = scanner.nextInt();
			
			System.out.println("the sum of the input is " + (x+y));
			
		}
		// e - base-class exception when you dont know what type of exception to look out for
		catch(Exception e) {
			System.out.println(e);
			System.out.println("please check your output");
		}	
		finally {
			System.out.println("the code is good");
			
			System.out.println("the total of the input of " + (x*y));
		}
		
	}

}

