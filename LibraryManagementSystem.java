import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class LibraryManagementSystem {

    static class Book {
        int id;
        String title;
        String author;
        LocalDate dateAdded;

        Book(int id, String title, String author, LocalDate dateAdded) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.dateAdded = dateAdded;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        int nextId = 1;

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Report Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1, 3 -> {
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();

                    books.add(new Book(nextId++, title, author, LocalDate.now()));
                    System.out.println("Book added successfully.");
                }
                case 2 -> {
                    System.out.println("\nBooks in the library:");
                    for (Book book : books) {
                        System.out.println("ID: " + book.id +
                                ", Title: " + book.title +
                                ", Author: " + book.author +
                                ", Date Added: " + book.dateAdded);
                    }
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> {
                    System.out.println("Invalid option. Try again.");
                }
            }
            scanner.close();
        }
        
    }
}
