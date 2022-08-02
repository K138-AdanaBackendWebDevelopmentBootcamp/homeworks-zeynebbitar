package dev.patika.graduation_project_school_management_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(generator = "Student", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Student", sequenceName = "STUDENT_SEQ_ID")
    private long StudentId;
    private String name;
    private String gender;
    private LocalDate birthDate;
    private String address;
    @ManyToMany(targetEntity = Student.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courseList;
}
