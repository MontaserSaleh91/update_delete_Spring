package com.project.updatedelete.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.updatedelete.models.Book;
import com.project.updatedelete.services.BookService;

@Controller
public class Books {
	private final BookService bookService;
    public Books(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/books/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book",book);
        return "index.jsp";
    }
}
