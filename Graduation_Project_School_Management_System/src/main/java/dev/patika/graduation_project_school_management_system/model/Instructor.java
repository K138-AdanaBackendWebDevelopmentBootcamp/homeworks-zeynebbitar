package dev.patika.graduation_project_school_management_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Instructor {
    @Id
    @GeneratedValue(generator = "Instroctur",strategy= GenerationType.SEQUENCE)
 @SequenceGenerator(name = "Instroctur",sequenceName = "INSTROCTUR_SEQ_ID")
    private  long instructorId;
    private String name;
    private String address;
    private long phoneNumber;
    @OneToMany(targetEntity = Course.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
private List<Course> courseList;

}