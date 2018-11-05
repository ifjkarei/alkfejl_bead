package hu.elte.inf.webprogramozas.alkfejlbead.service;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Student;
import hu.elte.inf.webprogramozas.alkfejlbead.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
