package de.fspeer.bookhandlingsystemjava;


import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor
public class Book {
    @Id
    String id;
    String titel;
    String author;
    String isbn;

    public Book(String id, String titel, String author, String isbn) {
        this.id = id;
        this.titel = titel;
        this.author = author;
        this.isbn = isbn;
    }
}
