package com.demo.sell.dao;

import com.demo.sell.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface bookManageMapper {

    //增加书籍
    public void addBook(Book book);

    //移除书籍
    public void deleteBook(Book book);

    //修改价格
    public void updatePrice(Book book);

    //更新库存
    public void updateBookQuantity(String bookName, Integer quantity);

    //根据书籍编号查询书籍具体信息
    public Book queryBookInfoById(long id);

    //根据书籍名称查询书籍具体信息
    public Book queryBookInfoByName(String bookName);

    //查询库存
    public Integer getBookQuantity(String bookName);
}
