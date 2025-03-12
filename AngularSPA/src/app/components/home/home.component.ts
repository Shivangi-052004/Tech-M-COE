import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  standalone:false,
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  constructor(private router: Router) {}

  register() {
    this.router.navigate(['/register']);
  }
  home() {
    this.router.navigate(['/home']);
  }
  login() {
    this.router.navigate(['/login']);
  }
  topic() {
    this.router.navigate(['/topic']);
  }
  
}
