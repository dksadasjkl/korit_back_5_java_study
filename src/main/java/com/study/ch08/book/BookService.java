package com.study.ch08.book;

public class BookService {
    BookRepository bookRepository;

    BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
