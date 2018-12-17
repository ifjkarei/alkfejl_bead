package hu.elte.inf.webprogramozas.alkfejlbead.controller;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Student;
import hu.elte.inf.webprogramozas.alkfejlbead.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Student>> getAll() {
        return ResponseEntity.ok(studentRepository.findAll());
    }

    @GetMapping("/{neptun}")
    public ResponseEntity<Student> get(@PathVariable String neptun) {
        Optional<Student> student = studentRepository.findByNeptun(neptun);
        if (student.isPresent()) {
            return ResponseEntity.ok(student.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Student> post(@RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);
        return ResponseEntity.ok(savedStudent);
    }

    @DeleteMapping("/{neptun}")
    public ResponseEntity delete(@PathVariable String neptun) {
        Optional<Student> oMessage = studentRepository.findByNeptun(neptun);
        if (oMessage.isPresent()) {
            studentRepository.deleteByNeptun(neptun);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
