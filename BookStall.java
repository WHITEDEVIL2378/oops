class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getters and setters for book attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Library {
    private Book[] books;
    private int bookCount;

    // Initial capacity
    private static final int INITIAL_CAPACITY = 10;

    public Library() {
        books = new Book[INITIAL_CAPACITY];
        bookCount = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (bookCount == books.length) {
            // Handle array overflow (e.g., create a new array with increased capacity)
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        books[bookCount++] = book;
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        int index = findBookIndex(book);
        if (index != -1) {
            // Shift elements to the left
            for (int i = index; i < bookCount - 1; i++) {
                books[i] = books[i + 1];
            }
            bookCount--;
        } else {
            System.out.println("Book not found.");
        }
    }

    // Method to search for a book by title
    public Book searchBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; // Book not found
    }

    // Helper method to find the index of a book
    private int findBookIndex(Book book) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].equals(book)) {
                return i;
            }
        }
        return -1; // Book not found
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }
}

public class BookStall {
    public static void main(String[] args) {
        Library library = new Library();
	   Book g = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        // Add some books
        library.addBook(g);
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));

        // Search for a book
        Book foundBook = library.searchBookByTitle("To Kill a Mockingbird");
        if (foundBook != null) {
            //foundBook.displayBookInfo();
        }
		//library.removeBook(g);
        // Display all books
        library.displayAllBooks();
    }
}








