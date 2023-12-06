// BookItem.java
public class BookItem extends Book implements LibraryItem {
    private int id;

    public BookItem(int id, String title, String author) {
        super(title, author);
        this.id = id;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
    }

    // Additional methods specific to BookItem
}
