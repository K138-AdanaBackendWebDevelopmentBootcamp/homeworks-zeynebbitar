package dev.patika.graduation_project_school_management_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PermanentInstructor extends Instructor {
    private double fixedSalary;

}
