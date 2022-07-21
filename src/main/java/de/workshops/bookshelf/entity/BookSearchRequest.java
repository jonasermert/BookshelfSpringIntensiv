package de.workshops.bookshelf.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookSearchRequest {

    private String author;
    private String isbn;

}
