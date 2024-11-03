 package com.restapi.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Entitys.Book;
import Entitys.DummyService;

@RestController
public class Controlller {
   

    @GetMapping("/books")
    public List<Book> books()
    {
      
       List<Book> li= DummyService.getAllBooks();


        return li;
    }
    

    @GetMapping("/books/{id}")
    public Book getbookbyid(@PathVariable int id)
    {
       Book b= DummyService.getBookbyId(id);

       return b;
    }
}