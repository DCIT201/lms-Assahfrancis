package book;

public class App {
	public static void main(String[] args) {
        // Create books
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        // Create patrons
        Patron patron1 = new Patron("Alice", "P001");
        Patron patron2 = new Patron("Bob", "P002");

        // Create library
        Library library = new Library();

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);

        // Add patrons to library
        library.addPatron(patron1);
        library.addPatron(patron2);

        // Simulate lending and returning books
        System.out.println("Lending book to Alice: " + library.lendBook(patron1, book1));  // Should succeed
        System.out.println("Lending book to Bob: " + library.lendBook(patron2, book1));    // Should fail (already borrowed)

        System.out.println("Returning book from Alice: " + library.returnBook(patron1, book1));  // Should succeed
        System.out.println("Returning book from Alice: " + library.returnBook(patron1, book1));  // Should fail (already returned)
    }
}
