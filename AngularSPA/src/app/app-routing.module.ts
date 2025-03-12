import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { RegisterComponent } from './components/register/register.component';
//import { QuizComponent } from './components/quiz/quiz.component';
import { LoginComponent } from './components/login/login.component';
import { QuestionComponent } from './components/question/question.component';
import { TopicComponent } from './components/topic/topic.component';
import { QuizComponent } from './components/quiz/quiz.component';
import { MathsComponent } from './components/maths/maths.component';
const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'quiz/:topic', component: QuizComponent } ,
  { path: 'register', component: RegisterComponent },  
  { path: 'login', component: LoginComponent },
  
  { path: 'question', component:QuestionComponent },
  { path: 'topic',component:TopicComponent},
  { path: 'maths', component: MathsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
