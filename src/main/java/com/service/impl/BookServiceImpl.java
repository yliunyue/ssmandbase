package com.service.impl;

import com.domain.Book;
import com.mapper.BookMapper;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public void insert(Book book)  {
        bookMapper.insert(book);
    }

    @Override
    public List<Book> findAll()  {
        List<Book> bookList = bookMapper.findAll();
        return bookList;
    }

    @Override
    public List<Book> findByCondition(Book book) {
        return bookMapper.findByCondition(book);
    }

    @Override
    public void delete(int bookId) {
        bookMapper.delete(bookId);
    }

    @Override
    public void update(Book book) {
        bookMapper.update(book);
    }
}
