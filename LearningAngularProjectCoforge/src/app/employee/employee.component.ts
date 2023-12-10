import { Component, Input } from '@angular/core';
import { Employee } from './model/employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
})
export class EmployeeComponent {
  submitted: boolean;

  getData() {
    // throw new Error('Method not implemented.');
    this.submitted = true;
  }
  @Input() emp1: Employee;
  resetForm() {
    // Reset the form and clear the employee data
    this.submitted = false;
  }
  constructor() {
    this.submitted = false;
    this.emp1 = new Employee();
  }
}
