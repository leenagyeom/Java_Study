package ch21;

public class Book {
	
	private String title;
	private String author;
	
	public Book() {}
	// default constructor
	public Book(String title, String autor) {
		this.title = title;
		this.author = autor;
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
	public void setAuthor(String autor) {
		this.author = autor;
	}
	
	public void showInfo() {
		System.out.println(title + ", " + author);
	}

}
