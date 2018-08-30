package Library;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImp implements BookDao {
	
	List <Book> books;
	
	public BookDaoImp () {
		books = new ArrayList<Book>();
		
		Book book1 = new Book (11, "Hunger Games", "Suzanne Collins", 1990, 29.99);
		Book book2 = new Book (32, "Dune", "Frank Herbert", 1956, 30.99);
		Book book3 = new Book (75, "Blackthorne", "John Smith", 2001, 9.99);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
	}

	@Override
	public void createBook() {
		books.addAll(books);
		
	}

	@Override
	public Book getInfo(Book book) {
		return book;
	}

	@Override
	public void updateBook(Book book) {
//		books.get(book.getId()).setTitle(book.getTitle());
//		book.getId(book.setId());
		System.out.println(book.getId());
		books.get(0).setTitle(book.getTitle());
		System.out.println("Book ID: " + book.getId() + " has been updated in the database.");
		
	}

	@Override
	public void deleteBook(Book book) {
		books.remove(book.getId());
//		System.out.println(book.getId());
		System.out.println("Book ID: " + book.getId() + " has been deleted from the database.");
	}

	@Override
	public List<Book> getAllBooks() {
		return books;
	}

}
