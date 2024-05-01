package org.example.bookmanagement.Repository;
import org.example.bookmanagement.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository {
    List<Book> findByTitle(String title);
    List<Book> findByAuthorName(String authorName);
    List<Book> findByGenreName(String genreName);

}
