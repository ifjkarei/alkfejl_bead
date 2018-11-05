package hu.elte.inf.webprogramozas.alkfejlbead.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Column
    private String name;

    @Column
    private Date birth;

    @Id
    @Column
    private String neptun;

    @ManyToMany(mappedBy = "students")
    @JsonIgnore
    private List<Subject> subjects;
}
