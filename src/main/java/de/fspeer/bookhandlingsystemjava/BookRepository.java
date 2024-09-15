package de.fspeer.bookhandlingsystemjava;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends MongoRepository<Book, String> {
//    Book findByIsbn(String isbn);
//    List<Book> findByAuthor(String author);
//    List<Book> findByTitel(String titel);
}
