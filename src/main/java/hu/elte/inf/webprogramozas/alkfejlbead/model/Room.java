package hu.elte.inf.webprogramozas.alkfejlbead.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "rooms")

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String roomNum;

    @Column
    private String roomName;

    @ManyToMany(mappedBy = "rooms")
    @JsonIgnore
    private List<Subject> subjects;


}
