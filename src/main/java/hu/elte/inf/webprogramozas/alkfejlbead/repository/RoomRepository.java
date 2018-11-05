package hu.elte.inf.webprogramozas.alkfejlbead.repository;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    @Override
    public List<Room> findAll();
}
