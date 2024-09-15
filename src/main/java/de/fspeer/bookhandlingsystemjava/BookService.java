package de.fspeer.bookhandlingsystemjava;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    @Autowired
    private final BookRepository bookRepository;

    //method for create a book
    public Book createBook(BookRequestDTO bookRequestDTO) {
        return bookRepository.save(new Book(null, bookRequestDTO.titel(), bookRequestDTO.author(), bookRequestDTO.isbn()));
    }

    //find a book by its ID
    public Book getBookById(String id) {
        return bookRepository.findById(id).orElseThrow();
    }

    //get a List of all books
    public List<BookResponseDTO> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(book -> new BookResponseDTO(book.getId(), book.getTitel(), book.getAuthor(), book.getIsbn()))
                .collect(Collectors.toList());
    }

    //update information of a book
    public Book updateBook(String id, BookRequestDTO bookRequestDTO) {
        Book oldBook = bookRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return bookRepository.save(new Book(oldBook.getId(), bookRequestDTO.titel(), bookRequestDTO.author(), bookRequestDTO.isbn()));
    }

    //delete a book
//    public void deleteBook(String id) {
//        bookRepository.deleteById(id);
//    }

}
