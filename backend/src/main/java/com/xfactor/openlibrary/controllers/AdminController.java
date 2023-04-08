package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.Domain.Admin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("admin")
public class AdminController
{
   ArrayList<Admin> lAdmin=new ArrayList<>();
   @PostMapping("/saveAdmin")
   public Admin saveAuthor(@RequestBody Admin admin) 
   {
    lAdmin.add(admin);
    return admin;
   }

   @GetMapping("/getAllAdmin")
   public ArrayList<Admin> getAllAdmins(){
    return lAdmin;
   }
}
