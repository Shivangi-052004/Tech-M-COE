import { Component } from '@angular/core';

@Component({
  selector: 'app-quiz',
  standalone:false,
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent {
  topic: string = "Maths Quiz";
  questions: any[] = [
    { question: "What is 2 + 2?", choices: ["3", "4", "5"], answer: "4" },
    { question: "What is 10 - 6?", choices: ["5", "4", "3"], answer: "4" },
    { question: "What is 5 x 5?", choices: ["20", "25", "30"], answer: "25" }
  ];
  
  currentQuestionIndex: number = 0;
  selectedAnswer: string = "";
  score: number = 0;
  showResult: boolean = false;

  submitAnswer() {
    if (this.selectedAnswer === this.questions[this.currentQuestionIndex].answer) {
      this.score++;
    }
    this.selectedAnswer = ""; // Reset selection
    this.currentQuestionIndex++;
  
    if (this.currentQuestionIndex >= this.questions.length) {
      this.showResult = true;
    }
  }
  
  goToPrevious() {
    if (this.currentQuestionIndex > 0) {
      this.currentQuestionIndex--;
      this.selectedAnswer = ""; // Reset selection when going back
    }
  }
  
    
}
