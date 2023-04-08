package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.Domain.Author;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("author")
public class AuthorController
{
   ArrayList<Author> lAuthors=new ArrayList<>();
   @PostMapping("/saveAuthor")
   public Author saveAuthor(@RequestBody Author author) 
   {
    lAuthors.add(author);
    return author;
   }

   @GetMapping("/getAllAuthor")
   public ArrayList<Author> getAllAuthors(){
    return lAuthors;
   }
}
