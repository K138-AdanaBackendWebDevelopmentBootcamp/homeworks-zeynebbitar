package dev.patika.graduation_project_school_management_system.controller;

import dev.patika.graduation_project_school_management_system.model.PermanentInstructor;
import dev.patika.graduation_project_school_management_system.service.Permanent_Instructor_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/PermanentInstructors")
@RestController
@RequiredArgsConstructor
public class Permanent_Instructor_Controller {
    final Permanent_Instructor_Service service;
    @GetMapping("")
    public ResponseEntity<List<PermanentInstructor>> getAll_PermanentInstructors(){
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<PermanentInstructor> getPermanentInstructor_By_Id(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping("")
    public ResponseEntity <PermanentInstructor> save(@RequestBody PermanentInstructor permanentInstructor) {
        return ResponseEntity.ok(service.save(permanentInstructor));
    }
        @PutMapping("")
        public ResponseEntity <PermanentInstructor> update (@RequestBody PermanentInstructor permanentInstructor){
            return ResponseEntity.ok(service.update(permanentInstructor));
        }
       @DeleteMapping("")
    public ResponseEntity <String> delete (@RequestBody  PermanentInstructor permanentInstructor){
        service.delete(permanentInstructor);
        return ResponseEntity.ok(" Data was deleted successfully");
       }

       @DeleteMapping("/{id}")
    public ResponseEntity <String> delete_By_Id(@PathVariable Long id ){
        service.deleteById(id);
        return ResponseEntity.ok("PermanentInstructor data that have Id : " + id + " Was deleted successfully");

       }
}