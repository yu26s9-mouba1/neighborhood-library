package com.pluralsight;
import java.util.Scanner;

public class NeighborhoodLibraryApp {
    private static Scanner scanner = new Scanner(System.in);


    //Creating an array that will contain 20 books
    private static Book[] Books = new Book[20];

    public static void main(String[] args) {
        initializeBooks(); //Calling the method

        boolean running = true; //The program will keep running non stop I set the boolean to false

        while (running) {
            System.out.println("\n=== Welcome to the Neighborhood Library By Mubarak Congacou ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                showAvailableBooks();
            } else if (choice == 2) {
                showCheckedOutBooks();
            } else if (choice == 3) {
                running = false;
            } else {
                System.out.println("Invalid choice. Please try again. ");
            }
        }


        System.out.println("Goodbye!");


    }


    // Created a method that contains an array of 20 books
    public static void initializeBooks() {

        Books[0] = new Book(1, "9780140449136", "The Odyssey", false, "");
        Books[1] = new Book(2, "9780140449181", "The Iliad", false, "");
        Books[2] = new Book(3, "9780061120084", "To Kill a Mockingbird", true, "Moubarak");
        Books[3] = new Book(4, "9780451524935", "1984", false, "");
        Books[4] = new Book(5, "9780743273565", "The Great Gatsby", false, "");
        Books[5] = new Book(6, "9781501125927", "It", true, "Ali");
        Books[6] = new Book(7, "9780439139595", "Harry Potter and the Goblet of Fire", false, "");
        Books[7] = new Book(8, "9780307277671", "The Road", false, "");
        Books[8] = new Book(9, "9780553380163", "A Game of Thrones", true, "Yusuf");
        Books[9] = new Book(10, "9780345339683", "The Hobbit", false, "");
        Books[10] = new Book(11, "9780618640157", "The Lord of the Rings", false, "");
        Books[11] = new Book(12, "9780141439600", "Pride and Prejudice", false, "");
        Books[12] = new Book(13, "9780140449266", "Crime and Punishment", true, "Omar");
        Books[13] = new Book(14, "9780679783268", "Moby Dick", false, "");
        Books[14] = new Book(15, "9780486415871", "Dracula", false, "");
        Books[15] = new Book(16, "9780307474278", "The Girl with the Dragon Tattoo", true, "Hassan");
        Books[16] = new Book(17, "9780060850524", "Brave New World", false, "");
        Books[17] = new Book(18, "9781594633669", "The Kite Runner", false, "");
        Books[18] = new Book(19, "9780385472579", "Zen and the Art of Motorcycle Maintenance", false, "");
        Books[19] = new Book(20, "9780140449273", "The Brothers Karamazov", true, "Ibrahim");


    }


        //Listing all books for user interface
    public static void ListAllBooks() {
        for (int i = 0; i < Books.length; i++) {
            System.out.println(Books[i].getBookID() + " | " + Books[i].getBookIsbn() + " | " + Books[i].getBookTittle());
        }
    }

    public static void showAvailableBooks() {
        System.out.println("\n=== Available Books ===");

        for (int i = 0; i < Books.length; i++) {
            if (!Books[i].isCheckedOut()) {
                System.out.println(Books[i].getBookID() + " | " + Books[i].getBookIsbn() + " | " + Books[i].getBookTittle());

            }
        }


        //Prompting the user for options
        System.out.println("\nEnter C to check out a book or x to go back:");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("C")) {
            System.out.println("Enter the ID of the book to check out: ");
            int id = scanner.nextInt();

            scanner.nextLine(); //Making sure everything is display clearly

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            boolean found = false;

            for (int i = 0; i < Books.length; i++) {
                if (Books[i].getBookID() == id && !Books[i].isCheckedOut()) {
                    Books[i].setCheckedOut(true);
                    Books[i].setCheckedOutTo(name);
                    System.out.println("Book checked out successfully.");
                    found = true;
                    break;

                }
            }

            if (!found) {
                System.out.println("Book not found or already checked out.");
            }


        }
    }

    //Creating a method for checkedout books
    public static void showCheckedOutBooks() {
        System.out.println("\n=== Checked Out Books");

        for (int i = 0; i < Books.length; i++) {
            if (Books[i].isCheckedOut()) {
                System.out.println(Books[i].getBookID() + " | " + Books[i].getBookIsbn() + " | " + Books[i].getBookTittle() + " | Checked out to: " + Books[i].getCheckedOutTo());


            }
        }


        //Prompting the user to choose either they want to check in a book or to go back to the menu
        System.out.println("\nEnter C to check in a book or X to go back:");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("C")) {
            System.out.println("Enter the ID of the book to check in: ");
            int id = scanner.nextInt();

            boolean found = false;

            for (int i = 0; i < Books.length; i++) {
                if (Books[i].getBookID() == id && Books[i].isCheckedOut()) {
                    Books[i].checkIn();
                    System.out.println("Book checked in successfully.");

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Book not found or it is not currently checked out.");

            }
        }

    }


}











