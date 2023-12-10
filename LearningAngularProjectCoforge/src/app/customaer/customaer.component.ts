import { Component } from '@angular/core';
import { Customer } from './customer';

@Component({
  selector: 'app-customaer',
  templateUrl: './customaer.component.html',
  styleUrls: ['./customaer.component.css']
})
export class CustomaerComponent {
  customer: Customer;
  customer1: Customer[];

  customerinfo(){
    alert(`id is ${this.customer.id}\n name is ${this.customer.name} \nsalary is ${this.customer.salary}`)
  }
  constructor() {
    this.customer = {
      'id': 10001,
      'name': 'suman kumar',
      'salary': 78000,
      'image':'http://i.annihil.us/u/prod/marvel/i/mg/6/60/5261a80a67e7d.jpg',
      'width':200,
      'height':150
    }
    this.customer1 = [
      {
        'id': 90001,
        'name': 'aman kumar',
        'salary': 79000,
        'image':'http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55.jpg',
        'width':200,
        'height':150
      },
      {
        'id': 90002,
        'name': 'pavan kumar',
        'salary': 45000,
        'image':'http://i.annihil.us/u/prod/marvel/i/mg/2/60/537bcaef0f6cf.jpg',
        'width':200,
        'height':150
      },
      {
        'id': 90003,
        'name': 'Ram kumar',
        'salary': 17000,
        'image':'http://i.annihil.us/u/prod/marvel/i/mg/3/50/537ba56d31087.jpg',
        'width':200,
        'height':150
      },
      {
        'id': 90004,
        'name': 'Sakshi Saini',
        'salary': 67000,
        'image':'http://i.annihil.us/u/prod/marvel/i/mg/d/50/50febb79985ee.jpg',
        'width':200,
        'height':150
      },
      {
        'id': 90005,
        'name': 'vivek Rathore',
        'salary': 78000,
        'image':'http://i.annihil.us/u/prod/marvel/i/mg/6/70/526547e2d90ad.jpg',
        'width':200,
        'height':150
      },
      {
        'id': 90006,
        'name': 'jav Robert',
        'salary': 76000,
        'image':'http://i.annihil.us/u/prod/marvel/i/mg/6/40/526963dad214d.jpg',
        'width':200,
        'height':150

        
      }

    ]

  };
}
