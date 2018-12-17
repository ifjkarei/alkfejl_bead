import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import {Subject} from "../subject";
import {Student} from "../student";
import {SubjectService} from "../subject.service"

@Component({
  selector: 'app-subjects',
  templateUrl: './subjects.component.html',
  styleUrls: ['./subjects.component.css']
})
export class SubjectsComponent implements OnInit {

  @Input() student: Student;
  subjects: Subject[];

  constructor(private subjectService: SubjectService) { }

  ngOnInit() {
    this.getSubjects();
  }

  getSubjects(): void {
      this.subjectService.getSubjects()
        .subscribe(subject => this.subjects = subject);
  }

  delete(subject: Subject): void {
    this.subjects = this.subjects.filter(h => h !== subject);
    this.subjectService.deleteSubject(subject).subscribe();
  }

}
