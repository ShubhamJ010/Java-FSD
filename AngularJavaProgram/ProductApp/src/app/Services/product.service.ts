import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Product } from '../Model/Product';

@Injectable({ providedIn: 'root' })
export class ProductService {
  constructor(private http: HttpClient, private router: Router) {}

  getAll(): Observable<Product[]> {
    return this.http.get<Product[]>('http://localhost:9090/Product/all');
  }

  saveProduct(product: Product): Observable<Product> {
    console.log('product add service called ');
    return this.http.post<Product>(
      'http://localhost:9090/Product/add', 
      product
    );
  }
}
