import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../Model/Product';
import { ProductService } from '../Services/product.service';

@Component({
  selector: 'app-product-show-all',
  templateUrl: './product-show-all.component.html',
  styleUrls: ['./product-show-all.component.css'],
})
export class ProductShowAllComponent {
  prdlist: Observable<Product[]>;

  constructor(private service: ProductService) {
    this.prdlist = service.getAll();
  }
}
