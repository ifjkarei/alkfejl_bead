package hu.elte.inf.webprogramozas.alkfejlbead.controller;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Student;
import hu.elte.inf.webprogramozas.alkfejlbead.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> all() {
        return studentService.findAll();
    }
}
