package hu.elte.inf.webprogramozas.alkfejlbead.repository;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, String> {
    @Override
    public List<Lecturer> findAll();
}
