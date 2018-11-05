package hu.elte.inf.webprogramozas.alkfejlbead.controller;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Lecturer;
import hu.elte.inf.webprogramozas.alkfejlbead.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lecturer")
public class LecturerController {
    @Autowired
    private LecturerService lecturerService;

    @GetMapping("/all")
    public List<Lecturer> all() {
        return lecturerService.findAll();
    }
}
