import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { StudentsComponent }      from './students/students.component';
import { DashboardComponent} from "./dashboard/dashboard.component";
import { StudentDetailComponent }  from './student-detail/student-detail.component';
import { SubjectDetailComponent }  from './subject-detail/subject-detail.component';
import { SubjectsComponent } from "./subjects/subjects.component";

const routes: Routes = [
  { path: 'students', component: StudentsComponent },
  { path: '', redirectTo: '/dashboard', pathMatch: 'full'},
  { path: 'dashboard', component: DashboardComponent},
  { path: 'detail/:id', component: StudentDetailComponent },
  { path: 'subjectdetail/:id', component: SubjectDetailComponent },
  { path: 'subjects', component: SubjectsComponent },
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
