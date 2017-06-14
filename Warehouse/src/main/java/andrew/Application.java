package andrew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void run(String[] strings) throws Exception {

		jdbcTemplate.execute("DROP TABLE AUTHOR IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE AUTHOR(" +
				"authorId SERIAL, authorFirstName VARCHAR(255), authorLastName VARCHAR(255)," +
				"authorDateOfBirth DATE, authorBiography VARCHAR(255))");

		jdbcTemplate.execute("DROP TABLE BOOK IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE BOOK(" + "bookId SERIAL, bookTitle VARCHAR(255), authorId INT)");

		jdbcTemplate.execute("ALTER TABLE BOOK" +
				"    ADD FOREIGN KEY (authorId) REFERENCES AUTHOR (authorId) ");

		List<Object[]> splitUpAuthor = Arrays.asList("jan kowalski 1999-12-01 zyl", "tom jon 1899-11-13 zmarl").stream()
				.map(name -> name.split(" "))
				.collect(Collectors.toList());

		// Uses JdbcTemplate's batchUpdate operation to bulk load data
		jdbcTemplate.batchUpdate("INSERT INTO AUTHOR(authorFirstName, authorLastName, authorDateOfBirth, authorBiography) VALUES (?,?,?,?)", splitUpAuthor);


		// Split up the array of whole names into an array of first/last names
		List<Object[]> splitUpBook = Arrays.asList("Book1 1", "Book2 1", "Book3 1").stream()
				.map(name -> name.split(" "))
				.collect(Collectors.toList());

		// Uses JdbcTemplate's batchUpdate operation to bulk load data
		jdbcTemplate.batchUpdate("INSERT INTO BOOK(bookTitle, authorId) VALUES (?,?)", splitUpBook);


	}
}
