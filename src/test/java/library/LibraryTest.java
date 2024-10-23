package test.java.library;

// Imported Library, Book, Student, Test, JUnit
import main.java.library.Library;
import main.java.library.items.Book;
import main.java.library.patrons.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Created LibraryTest class
public class LibraryTest {

    // Test for adding library item to library.
    @Test
    public void testAddLibraryItem() {
        Library library = new Library();
        Book book = new Book("001", "Java Programming", "John Doe", "123456789", "Tech Press", 5, "Printed");

        library.addItem(book);
        assertNotNull(library.searchItemByTitle("Java Programming"));
    }

    // Test for borrowing item from library by student.
    @Test
    public void testBorrowItem() {
        Library library = new Library();
        Book book = new Book("001", "Java Programming", "John Doe", "123456789", "Tech Press", 5, "Printed");
        library.addItem(book);
        Student student = new Student("Jane Smith", "123 Main St", "555-1234", "S12345", "12");
        library.addPatron(student);

        library.borrowItem(student, "Java Programming");
        assertEquals(4, book.getCopies());
        assertTrue(student.getBorrowedItems().contains(book)); 
    }

    // Test for returning borrowed item to library.
    @Test
    public void testReturnItem() {
        Library library = new Library();
        Book book = new Book("001", "Java Programming", "John Doe", "123456789", "Tech Press", 5, "Printed");
        library.addItem(book);
        Student student = new Student("Jane Smith", "123 Main St", "555-1234", "S12345", "12");
        library.addPatron(student);

        library.borrowItem(student, "Java Programming");
        assertEquals(4, book.getCopies());

        library.returnItem(student, "Java Programming");
        assertEquals(5, book.getCopies()); 
        assertFalse(student.getBorrowedItems().contains(book)); 
    }

    // Test for borrowing unavailable item.
    @Test
    public void testBorrowUnavailableItem() {
        Library library = new Library();
        Book book = new Book("001", "Java Programming", "John Doe", "123456789", "Tech Press", 1, "Printed");
        library.addItem(book);
        Student student = new Student("Jane Smith", "123 Main St", "555-1234", "S12345", "12");
        library.addPatron(student);

        library.borrowItem(student, "Java Programming");
        library.borrowItem(student, "Java Programming"); 

        assertEquals(0, book.getCopies());  
    }

    // Test for adding patron and checking patron list.
    @Test
    public void testAddPatron() {
        Library library = new Library();
        Student student = new Student("Jane Smith", "123 Main St", "555-1234", "S12345", "12");

        library.addPatron(student);
        assertNotNull(library.searchPatronByName("Jane Smith")); 
    }
}
