package com.zgf.service.Impl;

import com.zgf.pojo.Books;
import com.zgf.mapper.BooksMapper;
import com.zgf.service.BooksService;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

public class BooksServiceImpl implements BooksService {
    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int add(Book book) {
        return booksMapper.add(book);
    }

    @Override
    public int delete(int bookID) {
        return booksMapper.delete(bookID);
    }

    @Override
    public int update(Map<String, Object> map) {
        return booksMapper.update(map);
    }

    @Override
    public List<Books> getAll() {
        return booksMapper.getAll();
    }

    @Override
    public Books getById(int bookID) {
        return booksMapper.getById(bookID);
    }
}
