package dev.patika.graduation_project_school_management_system.repository;

import dev.patika.graduation_project_school_management_system.model.PermanentInstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IPermanent_Instructor_Repository extends CrudRepository <PermanentInstructor,Long> {
    void deleteByfixedSalary(double fixed_Salary);
    List<PermanentInstructor> findTop3ByFixedSalary (double salary);

}
