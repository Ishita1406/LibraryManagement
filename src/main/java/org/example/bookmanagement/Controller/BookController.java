package org.example.bookmanagement.Controller;

import org.example.bookmanagement.Models.Author;
import org.example.bookmanagement.Models.Book;
import org.example.bookmanagement.Models.Genre;
import org.example.bookmanagement.Service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public Book deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
    @GetMapping("/search/title/{title}")
    public List<Book> searchByTitle(@PathVariable String title) {
        return bookService.searchByTitle(title);
    }

    @GetMapping("/search/author/{author}")
    public List<Book> searchByAuthor(@RequestBody Author author) {
        return bookService.searchByAuthor(author);
    }

    @GetMapping("/search/genre/{genre}")
    public List<Book> searchByGenre(@RequestBody Genre genre) {
        return bookService.searchByGenre(genre);
    }
}
