package com.controller;
//测试poll
import com.domain.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/insert")
    public ModelAndView insert(Book book) throws IOException {
        bookService.insert(book);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/insertSuccess");
        return modelAndView;
    }
    @RequestMapping("/findAll")
    public ModelAndView findAll() throws IOException {
        List<Book> bookList=bookService.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("bookList",bookList);
        modelAndView.setViewName("/bookList");
        return modelAndView;
    }

    @RequestMapping("/findByCondition")
    public ModelAndView findByCondition(Book book){
        List<Book> findbookList=bookService.findByCondition(book);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("bookConditionList",findbookList);
        modelAndView.setViewName("/condition");
        return modelAndView;
    }

    @RequestMapping("delete")
    public String delete(int bookId){
        bookService.delete(bookId);
        return "redirect:/book/findAll";
    }
    @RequestMapping("update")
    public String update(Book book){
        bookService.update(book);
        return "redirect:/book/findAll";
    }
}
