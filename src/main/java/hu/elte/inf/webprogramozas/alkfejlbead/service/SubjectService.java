package hu.elte.inf.webprogramozas.alkfejlbead.service;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Subject;
import hu.elte.inf.webprogramozas.alkfejlbead.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }
}
