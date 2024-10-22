package library.items;

// Created book class.
public class Book extends LibraryItem{
    private String format;

    public Book(String id, String title, String author, String isbn, String publisher, int copies, String format){
        super(id, title, author, isbn, publisher, copies);
        this.format = format;
    }

    // Created abstract method for item type.
    public String getItemType(){
        return "Book - " + format;
    }

    // Created getter and setter methods.
    public String getFormat(){
        return format;
    }

    public void setFormat(String format){
        this.format = format;
    }

    // Created toString method.
    public String toString(){
        return super.toString() + ", format='" + format + "'";
    }
    
}
