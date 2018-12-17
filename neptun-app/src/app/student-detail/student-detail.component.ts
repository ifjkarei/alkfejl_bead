import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

import { StudentService }  from '../student.service';
import { SubjectService }  from '../subject.service';
import { Student } from '../student';
import { Subject, StudentSubject } from '../subject';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {

  @Input() student: Student;

  subjects: Subject[];
  temp: StudentSubject[];

  constructor(
    private route: ActivatedRoute,
    private studentService: StudentService,
    private subjectService: SubjectService,
    private location: Location,
  ) { }

  ngOnInit() {
    this.getStudent();
    this.getStudentsSubjects();
    this.getSubjects();
  }

  getStudentsSubjects(){
    this.subjectService.getStudentsSubjects(this.student.id)
      .subscribe(studsub => this.temp = studsub);
  }

  getSubjects(){
    this.temp.forEach(e => this.subjectService.getSubject(e.subjectID)
      .subscribe(subject => this.subjects.concat(subject)));
  }

  getStudent(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.studentService.getStudent(id)
      .subscribe(student => this.student = student);
  }

  save(student: Student): void {
    this.studentService.updateStudent(student); this.location.back();
  }

}
