package Library;

import java.util.List;

import Library.Book;

public interface BookDao {
	
	public void createBook ();
	public Book getInfo(Book book);
	public void updateBook (Book book);
	public void deleteBook (Book book);
	public List <Book> getAllBooks();

}
