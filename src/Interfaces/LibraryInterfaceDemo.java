package Interfaces;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers jim = new KidUsers(12, "kids");
		jim.registeredAccount();
		jim.requestBook();
		
		System.out.println("====================");
		
		AdultUsers may = new AdultUsers(60, "Fiction");
		may.registeredAccount();
		may.requestBook();
	}
	
}
