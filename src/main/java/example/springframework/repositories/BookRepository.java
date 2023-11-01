package example.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import example.springframework.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
