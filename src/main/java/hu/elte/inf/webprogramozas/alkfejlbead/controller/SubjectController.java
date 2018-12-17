package hu.elte.inf.webprogramozas.alkfejlbead.controller;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Subject;
import hu.elte.inf.webprogramozas.alkfejlbead.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Subject>> getAll() {
        return ResponseEntity.ok(subjectRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> get(@PathVariable Integer id) {
        Optional<Subject> subject = subjectRepository.findById(id);
        if (subject.isPresent()) {
            return ResponseEntity.ok(subject.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Subject> post(@RequestBody Subject subject) {
        Subject savedSubject = subjectRepository.save(subject);
        return ResponseEntity.ok(savedSubject);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Subject> oMessage = subjectRepository.findById(id);
        if (oMessage.isPresent()) {
            subjectRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
