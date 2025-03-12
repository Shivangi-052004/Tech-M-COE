import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  standalone:false,
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  user = {
    name: '',
    email: ''
  };

  constructor(private router: Router) {}

  onSubmit() {
    localStorage.setItem('registeredName', this.user.name);
    localStorage.setItem('registeredEmail', this.user.email);
    alert('Registration successful! Please login to start the quiz.');
    this.router.navigate(['/login']); 
  }
}
