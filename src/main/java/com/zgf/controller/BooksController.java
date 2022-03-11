package com.zgf.controller;

import com.zgf.pojo.Books;
import com.zgf.service.BooksService;
import com.zgf.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {
    @Autowired
    @Qualifier("booksService")
    private BooksService booksService;

    // getAll
    @RequestMapping("all")
    public String all(Model model){
        List<Books> books = booksService.getAll();
        model.addAttribute("allBooks", JsonUtils.getJson(books));
        return "all";
    }

}
