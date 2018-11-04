package hu.elte.inf.webprogramozas.alkfejlbead.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "subjects")

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String name;

    @Column
    private String fromTime;

    @Column
    private String toTime;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Lecturer lecturer;

    @OneToMany(mappedBy = "subject")
    private List<Student> students;

    @ManyToMany
    @JoinTable
    private List<Room> rooms;


}
