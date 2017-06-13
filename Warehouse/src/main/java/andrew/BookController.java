package andrew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/book", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Book>> findAll() {
        List<Book> books = jdbcTemplate.query(
                "SELECT bookId, bookTitle, author FROM book",
                new Object[] {},
                (rs, rowNum) -> new Book(
                        rs.getLong("bookId"),
                        rs.getString("bookTitle"),
                        rs.getString("author"))
        );
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Book> findByBookId(@PathVariable(value = "bookId") Long bookId) {
            Book book =this.jdbcTemplate.queryForObject(
                "SELECT bookId, bookTitle, author FROM book WHERE bookId=?",
                new Object[] {bookId},
                (rs, rowNum) -> new Book(
                        rs.getLong("BookId"),
                        rs.getString("bookTitle"),
                        rs.getString("author"))
                );
                return new ResponseEntity<>(book, HttpStatus.OK);

    }

    @RequestMapping(value = "/book", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Book> add(@RequestBody Book book) {
        Object[] object = new Object[]{book.getBookTitle(), book.getAuthor()};
        jdbcTemplate.update(
                "INSERT INTO book (bookTitle, author) VALUES (?,?)", object);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<Book> edit(@PathVariable(value = "bookId") Long bookId, @RequestBody Book book) {
        Object[] object = new Object[]{book.getBookTitle(), book.getAuthor(), bookId};
        jdbcTemplate.update(
                "UPDATE book SET bookTitle=?, author=? WHERE bookId=?", object);
        return new ResponseEntity<>(book,HttpStatus.OK);
    }

    @RequestMapping(value = "/book/{bookId}", method = RequestMethod.DELETE)
    public ResponseEntity<Book> edit(@PathVariable(value = "bookId") Long bookId) {
        Object[] object = new Object[]{bookId};
        jdbcTemplate.update(
                "DELETE FROM book WHERE bookId=?", object);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // TODO: findById - uzupelnic na podstawie findAll
    // TODO: add(@RequestBody Book book) { }-  method = RequestMethod.GET

    // rest, sql, wrzucic na git


}
