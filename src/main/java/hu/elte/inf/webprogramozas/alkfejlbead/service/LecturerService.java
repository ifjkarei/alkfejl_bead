package hu.elte.inf.webprogramozas.alkfejlbead.service;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Lecturer;
import hu.elte.inf.webprogramozas.alkfejlbead.repository.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerService {
    @Autowired
    private LecturerRepository lecturerRepository;

    public List<Lecturer> findAll() {
        return lecturerRepository.findAll();
    }
}
