Project Overview:

The Library Management System is a Java-based application that allows users to manage library items, authors, and patrons. The system supports adding, removing, and searching for books, periodicals, authors, and patrons. Additionally, patrons can borrow and return items.

Main Features:

Library Item Management: Add, remove, and search for books and periodicals.

Author Management: Add, remove, and search for authors.

Patron Management: Add, remove, and search for patrons(students and employees).

Borrow and Return Items: Patrons can borrow and return items, and the system tracks the number of available copies.

Classes and Their Roles:

1.LibraryItem (Abstract Class):
Represents a general library item (e.g., Book, Periodical).
Contains common attributes such as ID, title, author, ISBN, publisher, and copies.

2.Book (Class):
Extends LibraryItem.
Represents a book in the library with an additional format attribute (Printed, Electronic, Audio).

3.Periodical (Class):
Extends LibraryItem.
Represents a periodical in the library with an additional type attribute (Printed, Electronic).

4.Patron (Abstract Class):
Represents a library patron (e.g., Student, Employee).
Contains attributes like name, address, phone number, and a list of borrowed items.

5.Student (Class):
Extends Patron.
Represents a student patron with additional attributes such as student ID and grade level.

6.Employee (Class):
Extends Patron.
Represents an employee patron with additional attributes such as employee ID and department.

7.Author (Class):
Represents an author in the library system.
Contains attributes like name, date of birth, and a list of written library items.

8.Library (Class):
Manages library items, authors, and patrons.
Provides functionality for adding, removing, searching, borrowing, and returning items.

9.LibraryMenu (Class):
Provides a menu-based interface for interacting with the library system via the command line.

10.Main (Class):
The entry point of the program, which initializes the library and launches the menu system.

Start Application:
To run the application, compile the code using your preferred Java IDE or from the command line. Once compiled, run the Main.java class to start the Library Management System.
