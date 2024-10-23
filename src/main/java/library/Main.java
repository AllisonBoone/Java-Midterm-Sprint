package main.java.library;
// Created Main class and main method to initialize Library and LibraryMenu.
public class Main {
    public static void main(String[] args){
        Library library = new Library();
        LibraryMenu menu = new LibraryMenu(library);

        menu.startMenu();
    }
    
}
