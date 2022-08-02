package dev.patika.graduation_project_school_management_system.repository;

import dev.patika.graduation_project_school_management_system.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudent_Repository  extends CrudRepository <Student,Long> {
    void  findByName (String student_name);
    void deleteByName (String student_name);

}
