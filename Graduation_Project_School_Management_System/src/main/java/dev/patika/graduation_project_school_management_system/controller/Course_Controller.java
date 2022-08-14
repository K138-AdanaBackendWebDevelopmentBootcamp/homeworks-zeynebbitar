package dev.patika.graduation_project_school_management_system.controller;

import dev.patika.graduation_project_school_management_system.model.Course;
import dev.patika.graduation_project_school_management_system.service.Course_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/Courses")
@RestController
@RequiredArgsConstructor
public class Course_Controller {
    final Course_Service service;
     @GetMapping ("")
    public ResponseEntity<List<Course>> getAll_Courses(){
         return ResponseEntity.ok(service.findAll());
     }
    @GetMapping("/{id}")
     public ResponseEntity<Course> getCourse_By_Id(@PathVariable Long id){
         return ResponseEntity.ok(service.findById(id));
     }

    @PostMapping("")
    public ResponseEntity <Course > save(@RequestBody Course course) {
        return ResponseEntity.ok(service.save(course));
    }
    @PutMapping("")
    public ResponseEntity <Course> update (@RequestBody Course course){
        return ResponseEntity.ok(service.update(course));
    }
    @DeleteMapping("")
    public ResponseEntity <String> delete (@RequestBody  Course course){
        service.delete(course);
        return ResponseEntity.ok(" Data was deleted successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <String> delete_By_Id(@PathVariable Long id ){
        service.deleteById(id);
        return ResponseEntity.ok("Course data that have Id : " + id + " Was deleted successfully");
    }
}
