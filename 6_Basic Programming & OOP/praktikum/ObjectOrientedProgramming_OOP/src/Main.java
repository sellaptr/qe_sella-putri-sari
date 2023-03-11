import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

class Book {
    private UUID id;
    private String title;
    private String author;
    private String category;

    public Book(String title, String author, String category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.category = category;
    }

//    membuat method set dan get untuk buku
    public UUID getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getCategory() {
        return this.category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return String.format("===\nID: %s\nTitle: %s\nAuthor: %s\nCategory: %s\n===", this.id, this.title, this.author, this.category);
    }
}

class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        this.books = new ArrayList<Book>();
    }

//    membuat data buku baru
    public void createBook(String title, String author, String category) {
        Book book = new Book(title, author, category);
        this.books.add(book);
        System.out.println("book created!");
        System.out.println(book.toString());
    }

    public void getAllBooks() {
        System.out.println("===ALL BOOKS===");
        for (Book book : this.books) {
            System.out.println(book.toString());
        }
    }

    public void getBookById(String id) {
        for (Book book : this.books) {
            if (book.getId().toString().equals(id)) {
                System.out.println(book.toString());
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void updateBook(String id, String title, String author, String category) {
        for (Book book : this.books) {
            if (book.getId().toString().equals(id)) {
                book.setTitle(title);
                book.setAuthor(author);
                book.setCategory(category);
                System.out.println("book updated!");
                System.out.println(book.toString());
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void deleteBook(String id) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getId().toString().equals(id)) {
                this.books.remove(i);
                System.out.println("book deleted!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
}

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to book management app");

        while (true) {
            System.out.println("Please choose your menu:");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter title:");
//                    String title = scanner.nextLine();
//
//                    System.out.println("Enter author:");
//                    String author = scanner.nextLine();
//
//                    System.out.println("Enter category:");
//                    String category = scanner.nextLine();
//                    System.out.println("===");
//                    System.out.println("ID: " + bookManager.);
//                    System.out.println("Title: " + Book.getTitle());
//                    System.out.println("Author: " + Book.getAuthor());
//                    System.out.println("Category: " + Book.getCategory());
//                    System.out.println("===");
//
//            }
        }
    }
}