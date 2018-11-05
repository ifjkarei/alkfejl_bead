package hu.elte.inf.webprogramozas.alkfejlbead.controller;

import hu.elte.inf.webprogramozas.alkfejlbead.model.Room;
import hu.elte.inf.webprogramozas.alkfejlbead.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/all")
    public List<Room> all() {
        return roomService.findAll();
    }
}
