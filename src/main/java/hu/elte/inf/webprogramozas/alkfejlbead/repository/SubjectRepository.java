package hu.elte.inf.webprogramozas.alkfejlbead.repository;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    @Override
    List<Subject> findAll();
}
