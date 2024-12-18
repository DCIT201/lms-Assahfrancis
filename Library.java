package book;

import java.util.ArrayList;
import java.util.List;

public class Library {

	 private List<Book> books;
	    private List<Patron> patrons;

	    // Constructor
	    public Library() {
	        this.books = new ArrayList<>();
	        this.patrons = new ArrayList<>();
	    }

	    // Method to add a book to the library
	    public void addBook(Book book) {
	        books.add(book);
	    }

	    // Method to add a patron to the library
	    public void addPatron(Patron patron) {
	        patrons.add(patron);
	    }

	    // Method to check if the library contains the book
	    public boolean containsBook(Book book) {
	        return books.contains(book);
	    }

	    // Method to lend a book to a patron
	    public boolean lendBook(Patron patron, Book book) {
	        return patron.borrowBook(book, this);
	    }

	    // Method to return a book from a patron
	    public boolean returnBook(Patron patron, Book book) {
	        return patron.returnBook(book, this);
	    }
}
