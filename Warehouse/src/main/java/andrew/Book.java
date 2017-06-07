package andrew;

import java.io.Serializable;

/**
 * Created by andrew on 06.05.17.
 */

public class Book implements Serializable{
    private Long id;
    private String bookTitle;
    private String author;

    public Book() {
    }

    public Book(Long id, String bookTitle, String author) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

}
