package andrew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by andrew on 13.06.17.
 */

@RestController
public class AuthorController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/author", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Author>> findAll() {
        List<Author> authors = jdbcTemplate.query(
                "SELECT authorId, authorFirstName, authorLastName, authorDateOfBirth, authorBiography FROM author",
                new Object[] {},
                (rs, rowNum) -> new Author(
                        rs.getLong("authorId"),
                        rs.getString("authorFirstName"),
                        rs.getString("authorLastName"),
                        rs.getDate("authorDateOfBirth"),
                        rs.getString("authorBiography"))
        );
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @RequestMapping(value = "/author/{authorId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Author> findByAuthorId(@PathVariable(value = "authorId") Long authorId) {
        Author author =this.jdbcTemplate.queryForObject(
                "SELECT authorId, authorFirstName, authorLastName, authorDateOfBirth, authorBiography FROM author WHERE authorId=?",
                new Object[] {authorId},
                (rs, rowNum) -> new Author(
                        rs.getLong("authorId"),
                        rs.getString("authorFirstName"),
                        rs.getString("authorLastName"),
                        rs.getDate("authorDateOfBirth"),
                        rs.getString("authorBiography"))
        );
        return new ResponseEntity<>(author, HttpStatus.OK);

    }

    @RequestMapping(value = "/author", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Author> add(@RequestBody Author author) {
        Object[] object = new Object[]{author.getAuthorFirstName(), author.getAuthorLastName(), author.getAuthorDateOfBirth(), author.getAuthorBiography()};
        jdbcTemplate.update(
                "INSERT INTO author (authorFirstName, authorLastName, authorDateOfBirth, authorBiography) VALUES (?,?,?,?)", object);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @RequestMapping(value = "/author/{authorId}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<Author> edit(@PathVariable(value = "authorId") Long authorId, @RequestBody Author author) {
        Object[] object = new Object[]{author.getAuthorFirstName(), author.getAuthorLastName(), author.getAuthorDateOfBirth(), author.getAuthorBiography(), authorId};
        jdbcTemplate.update(
                "UPDATE author SET authorFirstName=?, authorLastName=?, authorDateOfBirth=?, authorBiography=? WHERE authorId=?", object);
        return new ResponseEntity<>(author,HttpStatus.OK);
    }

    @RequestMapping(value = "/author/{authorId}", method = RequestMethod.DELETE)
    public ResponseEntity<Author> edit(@PathVariable(value = "authorId") Long authorId) {
        Object[] object = new Object[]{authorId};
        jdbcTemplate.update(
                "DELETE FROM author WHERE authorId=?", object);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
