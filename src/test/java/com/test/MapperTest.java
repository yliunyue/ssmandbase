package com.test;

import com.domain.Book;
import com.mapper.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    private BookMapper bookMapper;
    @Test
    public void test1(){
        Book book=new Book();
        book.setBookName("性");
        List<Book> condition = bookMapper.findByCondition(book);
        for(Book bok:condition){
            System.out.println(bok);
        }
    }
}
