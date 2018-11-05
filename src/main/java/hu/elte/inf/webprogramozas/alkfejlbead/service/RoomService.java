package hu.elte.inf.webprogramozas.alkfejlbead.service;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Room;
import hu.elte.inf.webprogramozas.alkfejlbead.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> findAll() {
        return roomRepository.findAll();
    }
}
