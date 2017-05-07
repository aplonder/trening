package andre.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@RestController
public class AppController {

    static List<Book> books;
    static {
        books = new ArrayList<>();
        books.add(new Book(1l, "Moja ksiazka", "ja"));
        books.add(new Book(2l, "Moja ksiazka 2", "ty"));
        books.add(new Book(3l, "Moja ksiazka 3", "on"));
    }
    @RequestMapping(value = "/book", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Book>> getAll() {
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Book> getByid(@PathVariable(value = "id") Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findAny()
                .map(book -> new ResponseEntity<>(book, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
