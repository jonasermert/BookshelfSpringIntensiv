package de.workshops.bookshelf.repository;

import de.workshops.bookshelf.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    Book findByIsbn(String isbn);
}
