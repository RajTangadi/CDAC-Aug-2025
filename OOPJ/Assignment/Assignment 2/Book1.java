/*
Problem 17: Library Book Addition 
Scenario: 
Create Book class with bookId, title, author. 
● Constructor + Getters/Setters 
● Create Library class with libraryName and static totalBooks 
● Method addBook(Book b) → increments totalBooks 
● Method displayTotalBooks() → prints totalBooks 
● Add 2 books to library and display total books 
*/

class Book1 {
    private int bookId;
    private String title;
    private String author;

    public Book1(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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
}

class Library {
    private String libraryName;
    private static int totalBooks = 0;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book1 b) {
        totalBooks++;
    }

    public void displayTotalBooks() {
        System.out.println("Total Books in " + libraryName + ": " + totalBooks);
    }

    public static void main(String[] args) {
        Library lib = new Library("City Library");

        Book1 b1 = new Book1(101, "Java Programming", "James Gosling");
        Book1 b2 = new Book1(102, "Effective Java", "Joshua Bloch");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayTotalBooks();
    }
}
