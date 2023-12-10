import { Injectable } from '@angular/core';
import { booksData } from '../Data/book.data';
import { book } from '../model/book';
@Injectable({
  providedIn: 'root',
})
export class BookService {
  getBook() {
    return booksData;
  }
}
