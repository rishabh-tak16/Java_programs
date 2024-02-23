import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. List all books");
            System.out.println("4. Exit");
            
            int option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    books.add(new Book(title, author, isbn));
                    System.out.println("Book added successfully");
                    break;
                case 2:
                    System.out.print("Enter book ISBN: ");
                    isbn = scanner.nextLine();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getIsbn().equals(isbn)) {
                            books.remove(i);
                            System.out.println("Book removed successfully");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("All books:");
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ")";
    }
}
