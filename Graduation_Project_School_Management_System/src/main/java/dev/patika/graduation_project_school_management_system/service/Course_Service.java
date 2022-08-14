package dev.patika.graduation_project_school_management_system.service;

import dev.patika.graduation_project_school_management_system.model.Course;
import dev.patika.graduation_project_school_management_system.repository.ICourse_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Course_Service {
    @Autowired
    private final ICourse_Repository repository;

    public Course_Service(ICourse_Repository repository) {
        this.repository = repository;
    }

    public List<Course> findAll() {
        List<Course> courseList = new ArrayList<>();
        Iterable<Course> courseIterable = repository.findAll();
        courseIterable.iterator().forEachRemaining(courseList::add);   // stream api
        return courseList;
    }

    public Course save(Course course) {
        return repository.save(course);
    }

    public Course update(Course course) {
        return repository.save(course);
    }

    public Course findById(Long id) {
        return repository.findById(id).get();
    }


   public void findByName(String Course_name){
        repository.findByCourseName(Course_name);
   }
      public void delete (Course course) {
         repository.delete(course);
      }
      public void deleteById (Long id){
         repository.deleteById(id);
      }

   public void deleteByCourseName (String courseName) {
         repository.deleteByCourseName(courseName);}


}

