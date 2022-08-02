package dev.patika.graduation_project_school_management_system.repository;

import dev.patika.graduation_project_school_management_system.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourse_Repository  extends CrudRepository<Course,Long> {
    void findByName(String Course_name);

    void deleteByCorseName(String corse_name);
}
