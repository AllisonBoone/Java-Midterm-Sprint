package main.java.library;

import java.util.Scanner;

import main.java.library.authors.Author;
import main.java.library.items.Book;
import main.java.library.items.Periodical;
import main.java.library.patrons.Employee;
import main.java.library.patrons.Patron;
import main.java.library.patrons.Student;

// Created LibraryMenu class.
public class LibraryMenu {
    private Scanner scanner;
    private Library library;

    // Created the constructor.
    public LibraryMenu(Library library){
        this.library = library;
        this.scanner = new Scanner(System.in);
    }

    // Created Options menu for user.
    public void startMenu(){
        while(true){
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Periodical");
            System.out.println("3. Add an Author");
            System.out.println("4. Add a Patron");
            System.out.println("5. Borrow an Item");
            System.out.println("6. Return an Item");
            System.out.println("7. Exit");
            System.out.println("Choose one of the following options: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                addBook();
                break;
                case 2:
                addPeriodical();
                break;
                case 3:
                addAuthor();
                break;
                case 4:
                addPatron();
                break;
                case 5:
                borrowItem();
                break;
                case 6:
                returnItem();
                break;
                case 7:
                System.out.println("Exiting...");
                return;
                default:
                System.out.println("Invalid option. Please choose from the following options.");
            }
        }
    }

     // Created add book menu for user.
    private void addBook(){
        System.out.println("Enter Book ID: ");
        String id = scanner.nextLine();

        System.out.println("Enter Title: ");
        String title = scanner.nextLine();

        System.out.println("Enter Author: ");
        String author = scanner.nextLine();

        System.out.println("Enter ISBN: ");
        String isbn = scanner.nextLine();

        System.out.println("Enter Publisher: ");
        String publisher = scanner.nextLine();

        System.out.println("Enter Amount of Copies: ");
        int copies = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Format (Printed, Electronic, Audio): ");
        String format = scanner.nextLine();

        Book book = new Book(id, title, author, isbn, publisher, copies, format);
        library.addItem(book);
        System.out.println("Book added successfully!");
    }

     // Created add Periodical menu for user.
     private void addPeriodical(){
         System.out.println("Enter Periodical ID: ");
         String id = scanner.nextLine();

         System.out.println("Enter Title: ");
         String title = scanner.nextLine();

         System.out.println("Enter Author: ");
         String author = scanner.nextLine();

         System.out.println("Enter ISBN: ");
         String isbn = scanner.nextLine();

         System.out.println("Enter Publisher: ");
         String publisher = scanner.nextLine();

         System.out.println("Enter Amount of Copies: ");
         int copies = scanner.nextInt();
         scanner.nextLine();

         System.out.println("Enter Type (Printed, Electronic): ");
         String type = scanner.nextLine();

         Periodical periodical = new Periodical(id, title, author, isbn,publisher, copies,type);
         library.addItem(periodical);
         System.out.println("Periodical added successfully!");
     }

     // Created add Author menu for user.
     private void addAuthor(){
        System.out.println("Enter Author Name: ");
         String name = scanner.nextLine();

         System.out.println("Enter Author DOB (YYYY-MM-DD): ");
         String dateOfBirth = scanner.nextLine();

        Author author = new Author(name, dateOfBirth);
        library.addAuthor(author);
        System.out.println("Author added successfully!");
     }

     // Created add patron menu for user.
     private void addPatron(){
        System.out.println("Enter Patron Type (1. Student, 2. Employee): ");
        int patronType = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name: ");
         String name = scanner.nextLine();

         System.out.println("Enter Address: ");
         String address = scanner.nextLine();

         System.out.println("Enter Phone Number: ");
         String phoneNumber = scanner.nextLine();

         if(patronType == 1){
            System.out.println("Enter Student ID: ");
            String studentId = scanner.nextLine();

            System.out.println("Enter Garde Level: ");
            String gradeLevel = scanner.nextLine();

            Student student = new Student(name, address, phoneNumber, studentId, gradeLevel);
            library.addPatron(student);
            System.out.println("Student added successfully!");
         }else if(patronType == 2){
            System.out.println("Enter Employee ID: ");
            String employeeId = scanner.nextLine();

            System.out.println("Enter Department: ");
            String department = scanner.nextLine();

            Employee employee = new Employee(name, address, phoneNumber, employeeId,department);
            library.addPatron(employee);
            System.out.println("Employee added successfully!");
         }else{
            System.out.println("Invalid patron type. Please choose from the following options.");
         }
     }

     // Created borrow item menu for user.
     private void borrowItem(){
        System.out.println("Enter Patron Name: ");
         String patronName = scanner.nextLine();
         Patron patron = library.searchPatronByName(patronName);

         if(patron != null){
            System.out.println("Enter Item Title to Borrow: ");
            String itemTitle = scanner.nextLine();
            library.borrowItem(patron, itemTitle);
         }else{
            System.out.println("Patron not found...");
         }
     }

     // Created return borrowed item menu for user.
     private void returnItem(){
        System.out.println("Enter Patron Name: ");
         String patronName = scanner.nextLine();
         Patron patron = library.searchPatronByName(patronName);

         if(patron != null){
            System.out.println("Enter Item Title to Return: ");
            String itemTitle = scanner.nextLine();
            library.returnItem(patron, itemTitle);
         }else{
            System.out.println("Patron not found...");
         }
     }
}
