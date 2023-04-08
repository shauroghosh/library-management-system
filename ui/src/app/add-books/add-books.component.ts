//ssssimport { HttpClient } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {FormBuilder , FormGroup, Validators} from '@angular/forms'
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-books',
  templateUrl: './add-books.component.html',
  styleUrls: ['./add-books.component.css']
})
export class AddBooksComponent implements OnInit {
  booksForm : FormGroup;
  constructor(private formbuilder: FormBuilder,private http:HttpClient,private router:Router) { 
    this.booksForm = this.formbuilder.group({
      title: ['', Validators.required],
      author: [],
      isbn: [],
      publication_date: [],
      publisher: [],
      copies: [],
      category: [],
      genre: [],
      subgenre: []
    })
  }

  ngOnInit(): void {
  }

  saveBook()
  {
    const bookData=this.booksForm.value;
this.http.post('http://localhost:8080/books/saveBook',bookData).subscribe(
response=>{
  console.log('BOOK SAVED TO DB')
  this.router.navigateByUrl('/books');
},error=>
{
  console.error("error in book save")
}


);
  }
}