package com.zgf.service;

import com.zgf.pojo.Books;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

public interface BooksService {
    // 增
    int add(Book book);
    // 删
    int delete(int bookID);
    // 改
    int update(Map<String,Object> map);
    // 查
    List<Books> getAll();
    Books getById(int bookID);
}
