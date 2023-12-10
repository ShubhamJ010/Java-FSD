import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomaerComponent } from './customaer.component';

describe('CustomaerComponent', () => {
  let component: CustomaerComponent;
  let fixture: ComponentFixture<CustomaerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CustomaerComponent]
    });
    fixture = TestBed.createComponent(CustomaerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
