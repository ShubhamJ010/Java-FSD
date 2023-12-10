import { Component } from '@angular/core';
import { Product } from '../Model/Product';
import { ProductService } from '../Services/product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css'],
})
export class AddProductComponent {
  prd: Product;

  constructor(private service: ProductService, private router: Router) {
    this.prd = new Product();
  }

  addProduct() {
    this.service.saveProduct(this.prd).subscribe(
      (data) => {
        console.log('Product added successfully:', data);
        this.router.navigate(['/product-list']);
      },
      (error) => {
        console.log('Error adding product:', error);
      }
    );
  }
}
