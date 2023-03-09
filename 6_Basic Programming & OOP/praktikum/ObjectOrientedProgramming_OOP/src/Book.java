import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
public class Book {

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




