package Library;

public class Book {
	
	private int id;
	private String title;
	private String author;
	private int releaseYear;
	private double price;
	
	public Book (int id, String title, String author, int year, double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.releaseYear = year;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
