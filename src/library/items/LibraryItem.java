package library.items;

public abstract class LibraryItem {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int copies;

    public LibraryItem(String id, String title, String author, String isbn, String publisher, int copies){
        this.id = id;
        this.title = title;
        this.author = author;
        this. isbn = isbn;
        this.publisher = publisher;
        this.copies = copies;
    }
    
}
