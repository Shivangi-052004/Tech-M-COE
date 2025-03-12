import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class QuizService {
  private quizzes: any = {
    "Maths Quiz": [
      { question: "What is 2 + 2?", choices: ["3", "4", "5"], answer: "4" },
      { question: "What is 10 - 6?", choices: ["5", "4", "3"], answer: "4" },
      { question: "What is 5 x 5?", choices: ["20", "25", "30"], answer: "25" }
    ]
  };

  getQuizQuestions(topic: string) {
    return this.quizzes[topic] || [];
  }
}
