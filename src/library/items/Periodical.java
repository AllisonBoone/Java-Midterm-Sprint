package library.items;

// Created the Periodical class.
public class Periodical extends LibraryItem{
    private String type;

    public Periodical(String id, String title, String author, String isbn, String publisher, int copies, String type){
        super(id, title, author, isbn, publisher, copies);
        this.type = type;
    }

    // Created abstract method.
    public String getItemType(){
        return "Periodical - " + type;
    }

    // Created getter and setter methods.
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    // Created toString method.
    public String toString(){
        return super.toString() + ", type='" + type + "'";
    }
    
}
