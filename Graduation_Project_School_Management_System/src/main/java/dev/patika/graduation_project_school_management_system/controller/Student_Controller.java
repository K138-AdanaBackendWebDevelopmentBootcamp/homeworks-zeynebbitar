package dev.patika.graduation_project_school_management_system.controller;

import dev.patika.graduation_project_school_management_system.model.Student;
import dev.patika.graduation_project_school_management_system.service.Student_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("Students")
public class Student_Controller {
    final Student_Service service;
    @GetMapping(" ")
    public ResponseEntity<List<Student>> getAll_Students(){
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getCourse_By_Id(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("")
    public ResponseEntity <Student> save(@RequestBody Student student) {
        return ResponseEntity.ok(service.save(student));
    }
    @PutMapping("")
    public ResponseEntity <Student> update (@RequestBody Student student){
        return ResponseEntity.ok(service.update(student));
    }
    @DeleteMapping("")
    public ResponseEntity <String> delete (@RequestBody  Student student){
        service.delete(student);
        return ResponseEntity.ok(" Data was deleted successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <String> delete_By_Id(@PathVariable Long id ){
        service.deleteById(id);
        return ResponseEntity.ok("Student data that have Id : " + id + " Was deleted successfully");

    }
}
