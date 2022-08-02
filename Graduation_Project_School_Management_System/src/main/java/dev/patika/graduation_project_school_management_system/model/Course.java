package dev.patika.graduation_project_school_management_system.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
    public class Course {
   @Id
    @GeneratedValue(generator = "course", strategy= GenerationType.SEQUENCE)
    private  long courseId;
    private String corseName;
    private String coursCode;
    private double creditScore;

    @ManyToMany
    private List <Student> studentList;
    @ManyToOne
    private Instructor instructor;

}
