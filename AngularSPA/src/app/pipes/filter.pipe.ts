import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter',
  standalone:false
})
export class FilterPipe implements PipeTransform {
  transform(quizzes: any[], difficulty: string): any[] {
    if (difficulty === 'All') return quizzes;
    return quizzes.filter(quiz => quiz.difficulty === difficulty);
  }
}
