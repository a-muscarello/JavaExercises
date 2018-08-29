package Interfaces;

public class AdultUsers implements LibraryUser {

	int age;
	String bookType;
	
	public AdultUsers (int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	

	@Override
	public void registeredAccount() {
		
		if (age > 12) {
			System.out.println("You have successfully registered under an Adult Account.");
		}
		else if (age < 12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
		}
	}

	@Override
	public void requestBook() {
		if (bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days.");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
		}
	}
	
}
