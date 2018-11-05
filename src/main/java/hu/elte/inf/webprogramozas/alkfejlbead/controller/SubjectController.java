package hu.elte.inf.webprogramozas.alkfejlbead.controller;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Subject;
import hu.elte.inf.webprogramozas.alkfejlbead.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/all")
    public List<Subject> all() {
        return subjectService.findAll();
    }
}
