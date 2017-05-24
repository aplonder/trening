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
public class DemoApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void run(String[] strings) throws Exception {

		jdbcTemplate.execute("DROP TABLE BOOK IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE BOOK(" +
				"id SERIAL, bookTitle VARCHAR(255), author VARCHAR(255))");

		// Split up the array of whole names into an array of first/last names
		List<Object[]> splitUpNames = Arrays.asList("Book Author").stream()
				.map(name -> name.split(" "))
				.collect(Collectors.toList());

		// Uses JdbcTemplate's batchUpdate operation to bulk load data
		jdbcTemplate.batchUpdate("INSERT INTO BOOK(bookTitle, author) VALUES (?,?)", splitUpNames);
	}
}
