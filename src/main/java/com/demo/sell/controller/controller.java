package com.demo.sell.controller;

import com.demo.sell.pojo.Book;
import com.demo.sell.service.BookSellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {


    @Autowired
    private BookSellService bookSell;

    @ResponseBody
    @RequestMapping("sell")
    public Book sellBook(String bookName, Integer quantity) {
        bookName = "深入浅出Spring Boot";
        quantity = 1;
        bookSell.bookSell(bookName, quantity);
        Book book = bookSell.getBookInfo(bookName);
        return book;

    }

}
