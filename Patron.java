package book;

import java.util.ArrayList;
import java.util.List;

public class Patron {
	private String name;
    private String patronId;
    private List<Book> borrowedBooks;

    // Constructor
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method to borrow a book from the library
    public boolean borrowBook(Book book, Library library) {
        // Check if the book exists in the library
        if (library.containsBook(book) && !borrowedBooks.contains(book)) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    // Method to return a book to the library
    public boolean returnBook(Book book, Library library) {
        // Check if the patron has the book borrowed
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            return true;
        }
        return false;
    }
}
