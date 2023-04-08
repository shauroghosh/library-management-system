package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.Domain.Publisher;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("publisher")
public class PublisherController
{
   ArrayList<Publisher> lPublishers=new ArrayList<>();
   @PostMapping("/savePublisher")
   public Publisher savePublisher(@RequestBody Publisher publisher) 
   {
    lPublishers.add(publisher);
    return publisher;
   }

   @GetMapping("/getAllPublisher")
   public ArrayList<Publisher> getAllPublishers(){
    return lPublishers;
   }
}
