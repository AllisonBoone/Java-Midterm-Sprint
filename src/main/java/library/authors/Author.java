package main.java.library.authors;

// Imported utils and LibraryItem
import java.util.ArrayList;
import java.util.List;

import main.java.library.items.LibraryItem;

// Created Author class.
public class Author {
    private String name;
    private String dateOfBirth;
    private List<LibraryItem> writtenItems;

    // Created the constructor.
    public Author(String name, String dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenItems = new ArrayList<>();
    }

    // Created list for written items by the author to add and remove from.
    public void addWrittenItem(LibraryItem item){
        writtenItems.add(item);
    }

    public void removeWrittenItem(LibraryItem item){
        writtenItems.remove(item);
    }

    // Created getter and setter methods.
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    // Created list of items written by author.
    public List<LibraryItem> getWrittenItems(){
        return writtenItems;
    }

    // Created toString method.
    public String toString(){
        return "Author{" +
        "name='" + name + '\'' +
        ", dateOfBirth='" + dateOfBirth + '\'' +
        ", writtenItems=" + writtenItems +
        '}';
    }
}
