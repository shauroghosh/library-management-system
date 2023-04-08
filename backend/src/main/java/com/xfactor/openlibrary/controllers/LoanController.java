package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.Domain.Loan;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("loan")
public class LoanController
{
   ArrayList<Loan> lloan=new ArrayList<>();
   @PostMapping("/saveLoan")
   public Loan saveLoan(@RequestBody Loan loan) 
   {
    lloan.add(loan);
    return loan;
   }

   @GetMapping("/getAllLoan")
   public ArrayList<Loan> getAllLoans(){
    return lloan;
   }
}
