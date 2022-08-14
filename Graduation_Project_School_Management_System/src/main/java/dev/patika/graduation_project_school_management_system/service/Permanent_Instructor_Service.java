package dev.patika.graduation_project_school_management_system.service;

import dev.patika.graduation_project_school_management_system.model.PermanentInstructor;
import dev.patika.graduation_project_school_management_system.repository.IPermanent_Instructor_Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Permanent_Instructor_Service {
    final IPermanent_Instructor_Repository repository;

    public Permanent_Instructor_Service(IPermanent_Instructor_Repository repository) {
        this.repository = repository;
    }

    public List<PermanentInstructor> findAll() {
        List<PermanentInstructor> permanentInstructorList =new ArrayList<>();
        Iterable <PermanentInstructor> permanentInstructorIterable= repository.findAll();
        permanentInstructorIterable.iterator().forEachRemaining(permanentInstructorList::add); // stream api
        return permanentInstructorList;
    }
    public PermanentInstructor save (PermanentInstructor permanentInstructor )  {
        return repository.save(permanentInstructor);
    }
    public PermanentInstructor update (PermanentInstructor permanentInstructor ){
        return repository.save(permanentInstructor);
    }
    public PermanentInstructor findById (Long id ){
        return repository.findById(id).get();
    }
    public void delete (PermanentInstructor permanentInstructor ) {
        repository.delete(permanentInstructor);
    }
    public void deleteById (Long id){
        repository.deleteById(id);
    }

    public void deleteByfixedsalary (double fixedSalary) {
       repository.deleteByfixedSalary (fixedSalary);}

    public List<PermanentInstructor> findTop3ByFixedSalary(){
        Iterable<PermanentInstructor> permanentInstructorIterable = repository.findTop3ByFixedSalary(1000);
        List<PermanentInstructor> topThree = new ArrayList<>();
     permanentInstructorIterable.forEach(topThree::add);
        return topThree;
    }
}
