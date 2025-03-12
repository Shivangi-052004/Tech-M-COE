import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-topic',
  standalone:false,
  templateUrl: './topic.component.html',
  styleUrls: ['./topic.component.css']
})
export class TopicComponent {
  selectedDifficulty = 'All';

  quizzes = [
    { name: 'Math Quiz', difficulty: 'Easy' },
    { name: 'Science Quiz', difficulty: 'Medium' },
    { name: 'History Quiz', difficulty: 'Hard' },
    { name: 'General Knowledge', difficulty: 'Medium' },
    { name: 'Programming Basics', difficulty: 'Easy' },
    { name: 'Advanced Coding', difficulty: 'Hard' }
  ];

  constructor(private router: Router) {}

  startQuiz(topic: string) {
    this.router.navigate(['/quiz', topic]);
  }
}
