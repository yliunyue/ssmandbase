package com.mapper;

import com.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface BookMapper {

    void insert(Book book);

    List<Book> findAll();

    List<Book> findByCondition(Book book);

    void delete(int bookId);

    void update(Book book);
}
