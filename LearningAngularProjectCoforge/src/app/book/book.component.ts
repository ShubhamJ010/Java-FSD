import { Component } from '@angular/core';
import { book } from './model/book';
import { BookService } from './service/book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css'],
})
export class BookComponent {
  bk: book[];

  constructor(private service: BookService) {
    this.bk = service.getBook();
  }
}
