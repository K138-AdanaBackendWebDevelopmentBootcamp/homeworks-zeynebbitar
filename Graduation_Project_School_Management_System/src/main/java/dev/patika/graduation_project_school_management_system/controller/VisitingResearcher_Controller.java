package dev.patika.graduation_project_school_management_system.controller;

import dev.patika.graduation_project_school_management_system.model.VisitingResearcher;
import dev.patika.graduation_project_school_management_system.service.Visiting_Researcher_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("VisitingResearchers")
public class VisitingResearcher_Controller {

        final Visiting_Researcher_Service service;
        @GetMapping(" ")
        public ResponseEntity<List<VisitingResearcher>> getAll_VisitingResearchers(){
            return ResponseEntity.ok(service.findAll());
        }
        @GetMapping("/{id}")
        public ResponseEntity<VisitingResearcher> getVisitingResearcher_By_Id(@PathVariable Long id){
            return ResponseEntity.ok(service.findById(id));
        }

    @PostMapping("")
    public ResponseEntity <VisitingResearcher> save(@RequestBody VisitingResearcher visitingResearcher) {
        return ResponseEntity.ok(service.save(visitingResearcher));
    }
    @PutMapping("")
    public ResponseEntity <VisitingResearcher> update (@RequestBody VisitingResearcher visitingResearcher){
        return ResponseEntity.ok(service.update(visitingResearcher));
    }
    @DeleteMapping("")
    public ResponseEntity <String> delete (@RequestBody VisitingResearcher visitingResearcher){
        service.delete(visitingResearcher);
        return ResponseEntity.ok(" Data was deleted successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <String> delete_By_Id(@PathVariable Long id ){
        service.deleteById(id);
        return ResponseEntity.ok("VisitingResearcher data that have Id : " + id + " Was deleted successfully");

    }
}
