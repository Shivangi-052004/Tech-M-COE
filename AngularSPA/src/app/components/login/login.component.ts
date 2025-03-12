import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone:false,
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  user = { name: '', email: '' };

  constructor(private router: Router) {} // ✅ Inject Router

  login() {
    const storedUser = localStorage.getItem('registeredUser');

    if (storedUser) {
      const registeredUser = JSON.parse(storedUser);

      if (this.user.name === registeredUser.name && this.user.email === registeredUser.email) {
        alert('Login Successful!');
        this.router.navigate(['/topic']); // ✅ Ensure path is correct
      } else {
        alert('Invalid Credentials');
      }
    } else {
      alert('No registered user found. Please register first.');
    }
  }
}
