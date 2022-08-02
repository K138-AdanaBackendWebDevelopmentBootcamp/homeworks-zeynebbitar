package dev.patika.graduation_project_school_management_system.service;

import dev.patika.graduation_project_school_management_system.model.Student;
import dev.patika.graduation_project_school_management_system.repository.IStudent_Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class Student_Service {

    final IStudent_Repository repository;

    public Student_Service(IStudent_Repository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
     List<Student> studentList = new ArrayList<>();
     Iterable <Student> studentIterable =repository.findAll();
        studentIterable.iterator().forEachRemaining(studentList::add);   // stream api
        return studentList;
    }
    public Student save (Student student )  {
        return repository.save(student);
    }
    public Student update (Student student ){
        return repository.save(student);
    }
    public Student findById (Long id ){
        return repository.findById(id).get();
    }
    public void delete (Student student ) {
        repository.delete(student);
    }
    public void deleteById (Long id){
        repository.deleteById(id);
    }

    public void  findByName (String Name) {
        repository.findByName(Name);
    }
    public void deleteByName (String Name) {
       repository.deleteByName(Name);
    }

}
