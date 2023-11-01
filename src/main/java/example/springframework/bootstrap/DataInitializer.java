package example.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import example.springframework.domain.Book;
import example.springframework.repositories.BookRepository;

@Component
public class DataInitializer implements CommandLineRunner {

  private final BookRepository bookRepository;

  public DataInitializer(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("component is running");
    Book book = new Book("Java for gurus", "123", "rand");

    Book saveBook = bookRepository.save(book);

    Book steveBiko = new Book("Once ", "90909", "capr");
    Book saveBIko = bookRepository.save(steveBiko);

    bookRepository.findAll().forEach(tbook -> {
      System.out.println(tbook.getId());
      System.out.println(tbook.getTitle());
    });

  }

}
