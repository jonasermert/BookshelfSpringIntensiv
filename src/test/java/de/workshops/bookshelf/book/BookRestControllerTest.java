package de.workshops.bookshelf.book;

import de.workshops.bookshelf.book.controller.BookRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BookRestControllerTest {

    @Autowired
    private BookRestController bookRestController;

    @Test
    void getAllBooks() {
        assertNotNull(bookRestController.getAllBooks().getBody());
        assertEquals(3, bookRestController.getAllBooks().getBody().size());
    }
}
