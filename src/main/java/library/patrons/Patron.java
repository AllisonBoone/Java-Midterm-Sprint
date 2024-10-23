package main.java.library.patrons;

// Imported utils and LibraryItem.
import java.util.ArrayList;
import java.util.List;

import main.java.library.items.LibraryItem;

// Created Patron class.
public abstract class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<LibraryItem> borrowedItems;

    // Created the constructor also initialized the list of borrowed items.
    public Patron(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber= phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }

    // Created list for borrowed items to add and remove from.
    public void borrowItem(LibraryItem item){
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item){
        borrowedItems.remove(item);
    }

    // Created getter and setter methods.
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // Created list of items borrowed.
    public List<LibraryItem> getBorrowedItems(){
        return borrowedItems;
    }

    // Created abstract method for patron type.
    public abstract String getPatronType();

    // Created toString method.
    public String toString(){
        return "Patron{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", borrowedItems=" + borrowedItems +
        '}';
    }

}
