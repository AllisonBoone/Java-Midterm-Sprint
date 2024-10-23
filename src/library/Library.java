package library;

// Imported LibraryItems, Author, Patron, and utils.
import library.items.LibraryItem;
import library.authors.Author;
import library.patrons.Patron;
import java.util.ArrayList;
import java.util.List;

// Created library class.
public class Library{
    private List<LibraryItem> items;
    private List<Author> authors;
    private List<Patron> patrons;

    // Created the constructor
    public Library(){
        this.items = new ArrayList<>();
        this.authors= new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Created library collection to add or remove from.
    public void addItem(LibraryItem item){
        items.add(item);
    }

    public void removeItem(LibraryItem item){
        items.remove(item);
    }

    // Created library item search by title.
    public LibraryItem searchItemByTitle(String title){
        for(LibraryItem item: items){
            if(item.getTitle().equalsIgnoreCase(title)){
                return item;
            }
        }

        return null;
    }

    // Created library item search by isbn.
    public LibraryItem searchItemByISBN(String isbn){
        for(LibraryItem item: items){
            if(item.getIsbn().equals(isbn)){
                return item;
            }
        }

        return null;
    }

    // Created library author add or remove.
    public void addAuthor(Author author){
        authors.add(author);
    }

    public void removeAuthor(Author author){
        authors.remove(author);
    }

    // Created library item search by author name.
    public Author searchAuthorByName(String name){
        for(Author author: authors){
            if(author.getName().equalsIgnoreCase(name)){
                return author;
            }
        }

        return null;
    }

    // Created library patron add or remove.
    public void addPatron(Patron patron){
        patrons.add(patron);
    }

    public void removePatron(Patron patron){
        patrons.remove(patron);
    }

    // Created library item search by patron name.
    public Patron searchPatronByName(String name){
        for(Patron patron: patrons){
            if(patron.getName().equalsIgnoreCase(name)){
                return patron;
            }
        }

        return null;
    }

    // Created library patron borrow and return available items.
    public void borrowItem(Patron patron, String itemTitle){
        LibraryItem item = searchItemByTitle(itemTitle);
        if(item != null && item.getCopies() > 0){
            patron.borrowItem(item);
            item.setCopies(item.getCopies() - 1);
            System.out.println("Item borrowed successfully!");
        }else{
            System.out.println("Item is not available...");
        }
    }

    public void returnItem(Patron patron, String itemTitle){
        LibraryItem item = searchItemByTitle(itemTitle);
        if(item != null && patron.getBorrowedItems().contains(item)){
            patron.returnItem(item);
            item.setCopies(item.getCopies() + 1);
            System.out.println("Item returned successfully!");
        }else{
            System.out.println("Item was not found...");
        }
    }
}
