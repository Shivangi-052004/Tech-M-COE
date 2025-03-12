import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-question',
  standalone:false,
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css']
})
export class QuestionComponent {
  @Input() questionData: any; // Receiving data from Parent
}
