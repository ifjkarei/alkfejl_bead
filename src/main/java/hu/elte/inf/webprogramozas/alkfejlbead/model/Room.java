package hu.elte.inf.webprogramozas.alkfejlbead.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "room")
    private List<Subject> subjects;


}
