package de.fspeer.bookhandlingsystemjava;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookResponseDTO> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(String id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable String id, @RequestBody BookRequestDTO bookRequestDTO) {
        return bookService.updateBook(id, bookRequestDTO);
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody BookRequestDTO bookRequestDTO) {
        return bookService.createBook(bookRequestDTO);
    }

}
