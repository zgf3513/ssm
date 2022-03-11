package com.zgf.mapper;

import com.zgf.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

public interface BooksMapper {
    // 增
    int add(Book book);
    // 删
    int delete(@Param("bookID") int bookID);
    // 改
    int update(Map<String,Object> map);
    // 查
    List<Books> getAll();
    Books getById(@Param("bookID") int bookID);
}
