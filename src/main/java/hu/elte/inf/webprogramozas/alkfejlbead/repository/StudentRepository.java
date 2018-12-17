package hu.elte.inf.webprogramozas.alkfejlbead.repository;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface StudentRepository extends JpaRepository<Student, String> {
    @Override
    List<Student> findAll();

    Optional<Student> findByNeptun(String neptun);

    void deleteByNeptun(String neptun);
}
