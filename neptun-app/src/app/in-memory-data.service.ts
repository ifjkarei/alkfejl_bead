import { InMemoryDbService } from 'angular-in-memory-web-api';
import { Student } from './student';
import { Injectable } from '@angular/core';
import {Subject } from './subject'

@Injectable({
  providedIn: 'root',
})
export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    let subjects = [
      {  id: 1, name: 'Pszichológia'},
      {  id: 2, name: 'Matek'},
      {  id: 3, name: 'Fizika'},
    ]
    let students = [
      { id: 1, name: 'Szandi', birth: '1997-09-23', subjectID: 1 },
      { id: 2, name: 'Kis Szandi' },
      { id: 3, name: 'Nagy Szandi' },
      { id: 4, name: 'Átlagos Szandi' },
      { id: 5, name: 'Pont Megfelelő Szandi' },
      { id: 6, name: 'Kiss Szandi' },
      { id: 7, name: 'K. Szandi' },
      { id: 8, name: 'Kis Sz.' },
      { id: 9, name: 'Szandika' },
      { id: 10, name: 'Béla' }
    ];
    let subjectsstudents = [
      {id:1, studentDd:1, subjectId: 1}
    ];

    return {students, subjects, subjectsstudents};

  }

  genId<T extends Student | Subject>(myTable: T[]): number {
    return myTable.length > 0 ? Math.max(...myTable.map(t => t.id)) + 1 : 1;
  }
}
