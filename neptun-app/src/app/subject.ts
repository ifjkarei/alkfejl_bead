import{Student} from "./student"
import{Lecturer} from "./lecturer"
import{Room} from "./room"

export class Subject{
  id: number;
  name:string;
  lecturer: Lecturer;
  students: Student[];
  room:Room;
  fromTime:string;
  toTime:string;
}

export class StudentSubject{
  id:number;
  studentID:number;
  subjectID:number;
}
