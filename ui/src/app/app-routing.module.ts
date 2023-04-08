import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBooksComponent } from './add-books/add-books.component';
import { AdminComponent } from './admin/admin.component';
import { AuthorComponent } from './author/author.component';
import { BookComponent } from './book/book.component';
import { PublishersComponent } from './publishers/publishers.component';
import { StudentsComponent } from './students/students.component';

const routes: Routes = [
  {
    path: 'books',
    component: BookComponent,
  },
  {
    path: 'author',
    component: AuthorComponent,
  },
  {
    path: 'add-books',
    component: AddBooksComponent,
  },
  {
    path: 'students',
    component: StudentsComponent,
  },
  {
    path: 'publishers',
    component: PublishersComponent,
  },
  {
    path: 'admin',
    component: AdminComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
