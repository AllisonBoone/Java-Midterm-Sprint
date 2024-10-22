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

    public abstract String getItemType();

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public int getCopies(){
        return copies;
    }

    public void setCopies(int copies){
        this.copies = copies;
    }

    public String toString(){
        return "LibraryItem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", copies=" + copies +
                '}';
    }

}
