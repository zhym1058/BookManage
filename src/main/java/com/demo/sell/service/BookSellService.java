package com.demo.sell.service;

import com.demo.sell.dao.bookManageMapper;
import com.demo.sell.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookSellService {

    @Autowired
    private bookManageMapper bookManageMapper;

    @Autowired
    private Book book;

    //销售书籍
    public void bookSell(String bookName, Integer quantity) {
        //查询书籍在不在
        book = bookManageMapper.queryBookInfoByName(bookName);
        //查询库存
        if(book != null) {
            Integer bookQuantity = bookManageMapper.getBookQuantity(bookName);
            System.out.println("库存：" + bookQuantity);
            if(bookQuantity > quantity ) {
                bookQuantity  = bookQuantity - quantity;
                bookManageMapper.updateBookQuantity(bookName,bookQuantity);
            }

        }


        //在的话，更新数据库，并把收入更新到资金流水系统里

    }

    //查询书籍信息
    public Book getBookInfo(String bookName) {
        Book book = new Book();
        book = bookManageMapper.queryBookInfoByName(bookName);
        return book;
    }
}
