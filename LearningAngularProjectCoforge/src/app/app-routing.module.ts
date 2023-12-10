import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CalculatorComponent } from './calculator/calculator.component';
import { CustomaerComponent } from './customaer/customaer.component';
import { EmployeeComponent } from './employee/employee.component';
import { InterestCalculationComponent } from './interest-calculation/interest-calculation.component';
import { PipeExampleComponent } from './pipe-example/pipe-example.component';
import { UserComponent } from './user/user.component';
import { BookComponent } from './book/book.component';

const routes: Routes = [
  { path: 'calculator', component: CalculatorComponent },
  { path: 'customer', component: CustomaerComponent },
  { path: 'employee', component: EmployeeComponent },
  { path: 'interset-calculation', component: InterestCalculationComponent },
  { path: 'pip_example', component: PipeExampleComponent },
  { path: 'user', component: UserComponent },
  { path: 'book', component: BookComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
