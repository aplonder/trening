package andrew;

import java.io.Serializable;

/**
 * Created by andrew on 06.05.17.
 */

public class Book implements Serializable {
    private Long bookId;
    private String bookTitle;
    private Author author;

    public Book() {
    }

    public Book(Long bookId, String bookTitle, Author author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public Long getBookId() {
        return bookId;
    }
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
