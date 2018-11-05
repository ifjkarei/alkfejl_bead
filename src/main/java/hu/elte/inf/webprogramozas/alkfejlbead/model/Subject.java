package hu.elte.inf.webprogramozas.alkfejlbead.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToMany
    @JoinTable
    private List<Student> students;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Room room;


}
