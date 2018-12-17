package hu.elte.inf.webprogramozas.alkfejlbead.controller;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Lecturer;
import hu.elte.inf.webprogramozas.alkfejlbead.repository.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/lecturer")
public class LecturerController {
    @Autowired
    private LecturerRepository lecturerRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<Lecturer>> getAll() {
        return ResponseEntity.ok(lecturerRepository.findAll());
    }

    @GetMapping("/{neptun}")
    public ResponseEntity<Lecturer> get(@PathVariable String neptun) {
        Optional<Lecturer> lecturer = lecturerRepository.findByNeptun(neptun);
        if (lecturer.isPresent()) {
            return ResponseEntity.ok(lecturer.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Lecturer> post(@RequestBody Lecturer lecturer) {
        Lecturer savedLecturer = lecturerRepository.save(lecturer);
        return ResponseEntity.ok(savedLecturer);
    }

    @DeleteMapping("/{neptun}")
    public ResponseEntity delete(@PathVariable String neptun) {
        Optional<Lecturer> oMessage = lecturerRepository.findByNeptun(neptun);
        if (oMessage.isPresent()) {
            lecturerRepository.deleteByNeptun(neptun);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
