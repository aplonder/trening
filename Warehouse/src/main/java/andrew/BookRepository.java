package andrew;

/**
 * Created by andrew on 07.05.17.
 */

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;



public class BookRepository  {
/*    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = "jdbc:sqlite:library.db";

    private Connection conn;
    private Statement stat;

    public BookRepository() {
        try {
            Class.forName(BookRepository.DRIVER);
        }
        catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
        }

        try {
            conn = DriverManager.getConnection(DB_URL);
            stat = conn.createStatement();
        }
        catch (SQLException e) {
            System.err.println("Problem z otwarciem polaczenia");
        }

        createTables();
    }

    public boolean createTables() {
        String createBooks = "CREATE TABLE IF NOT EXISTS books (id_books INTEGER PRIMARY KEY AUTOINCREMENT, bookTitle varchar(255), author varchar(255))";
        try {
            stat.execute(createBooks);
        }
        catch (SQLException e) {
            System.err.println("Błąd przy tworzeniu tabeli");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean insertBook(String bookTitle, String author) {
        try {
            PreparedStatement prepStmt = conn.prepareStatement("insert into books values (NULL, ?, ?);");
            prepStmt.setString(1, bookTitle);
            prepStmt.setString(2, author);
            prepStmt.execute();
        }
        catch (SQLException e) {
            System.err.println("Blad przy wprowadzeniu");
            return false;
        }
        return true;
    }

    public List<Book> selectBooks() {
        List<Book> books = new LinkedList<>();
        try {
            ResultSet result = stat.executeQuery("SELECT * FROM books");
            Long id;
            String bookTitle;
            String author;
            while (result.next()) {
                id = result.getLong("book_id");
                bookTitle = result.getString("bookTitle");
                author = result.getString("author");
                books.add(new Book(id, bookTitle, author));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return books;
    }

    public void closeConnection() {
        try {
            conn.close();
        }
        catch (SQLException e) {
            System.err.println("Problem z zamknieciem polaczenia");
            e.printStackTrace();
        }
    }*/
}
