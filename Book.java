package book;

public class Book {
	 private String title;
	    private String author;
	    private int yearPublished;

	    // Constructor
	    public Book(String title, String author, int yearPublished) {
	        this.title = title;
	        this.author = author;
	        this.yearPublished = yearPublished;
	
}

	 // Getter methods for encapsulation
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public int getYearPublished() {
	        return yearPublished;
	    }
}

