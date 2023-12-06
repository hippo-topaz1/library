// LibraryDemo.java
public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        BookItem book1 = new BookItem(1, "The Catcher in the Rye", "J.D. Salinger");
        BookItem book2 = new BookItem(2, "To Kill a Mockingbird", "Harper Lee");

        library.addItem(book1);
        library.addItem(book2);

        library.displayAllItems();
    }
}
