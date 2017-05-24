package andrew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/book", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Book>> findAll() {
        List<Book> books = jdbcTemplate.query(
                "SELECT id, bookTitle, author FROM book",
                new Object[] {},
                (rs, rowNum) -> new Book(
                        rs.getLong("id"),
                        rs.getString("bookTitle"),
                        rs.getString("author"))
        );
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    /*
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Book> findById(@PathVariable(value = "id") Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findAny()
                .map(book -> new ResponseEntity<>(book, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
*/

    // TODO: findById - uzupelnic na podstawie findAll
    // TODO: add(@RequestBody Book book) { }-  method = RequestMethod.GET




}
