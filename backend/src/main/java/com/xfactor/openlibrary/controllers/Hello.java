package com.xfactor.openlibrary.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam String name,int age,double salary,char ch) {
        return "Hello World,I am "+name +" I am " +age+ " years old"+" My salary is Rs"+salary+ " ch "+ch;
    }
    @GetMapping("/hi/{name}/{age}")
    public HashMap<String,String> sayHi(@PathVariable String name,@PathVariable int age)
    {
        HashMap<String,String> resHashMap = new HashMap<>();
        resHashMap.put("name",name);
        resHashMap.put("age",String.valueOf(age));
        return resHashMap;

    } 
   
    

}
