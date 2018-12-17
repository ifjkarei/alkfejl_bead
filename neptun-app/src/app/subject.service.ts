import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';

import {StudentSubject, Subject} from './subject';
import {Student} from "./student";
import {__param} from "tslib";

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class SubjectService {

  private subjectsUrl = 'api/subjects';

  constructor(private http: HttpClient) { }

  getSubjects(): Observable<Subject[]> {
      return this.http.get<Subject[]>(this.subjectsUrl)
        .pipe(
          catchError(this.handleError('getSubjects', []))
        );
  }

  getSubject(subjectID:number): Observable<Subject> {
    return this.http.get<Subject>(`${this.subjectsUrl}/${subjectID}`)
      .pipe(
        catchError(this.handleError<Subject>('getSubjects'))
      );
  }

  getStudentsSubjects(studentID:number){
    return this.http.get<StudentSubject[]>(`api/subjectsstudents/?studentID=${studentID}`)
      .pipe(
        catchError(this.handleError('getSubjects', []))
      );
  }

  deleteSubject (subject: Subject | number): Observable<Subject> {
    const id = typeof subject === 'number' ? subject : subject.id;
    const url = `${this.subjectsUrl}/${id}`;

    return this.http.delete<Subject>(url, httpOptions).pipe(
      catchError(this.handleError<Subject>('deleteStudent'))
    );
  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
