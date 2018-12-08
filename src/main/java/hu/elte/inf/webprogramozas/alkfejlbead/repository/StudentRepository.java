package hu.elte.inf.webprogramozas.alkfejlbead.repository;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface StudentRepository extends JpaRepository<Student, String> {
    @Override
    public List<Student> findAll();
}
