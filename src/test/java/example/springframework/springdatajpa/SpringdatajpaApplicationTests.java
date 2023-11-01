package example.springframework.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import example.springframework.repositories.BookRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Test
	void testBookRepository() {

		long count = bookRepository.count();
		assertTrue(count > 0);
	}

}
