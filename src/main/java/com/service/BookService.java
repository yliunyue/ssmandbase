package com.service;

import com.domain.Book;

import java.io.IOException;
import java.util.List;

public interface BookService {
    void insert(Book book) throws IOException;

    List<Book> findAll() throws IOException;

    List<Book> findByCondition(Book book);

    void delete(int bookId);

    void update(Book book);
}
