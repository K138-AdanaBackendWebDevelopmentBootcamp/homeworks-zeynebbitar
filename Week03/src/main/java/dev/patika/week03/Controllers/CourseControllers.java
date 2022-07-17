package dev.patika.week03.Controllers;
import dev.patika.week03.Models.Course;
import dev.patika.week03.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class CourseControllers {
    CourseService<Course> courseService;

    @Autowired
    public void setCourseService(CourseService<Course> courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourses() {
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }
    @PostMapping("/courses")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course) {
        return new ResponseEntity<>( courseService.save(course), HttpStatus.OK);
    }
    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable int id){
        //return new ResponseEntity<>( courseService.findById(id),HttpStatus.OK);
        return ResponseEntity.ok(courseService.findById(id));
    }

    @PutMapping("/courses")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
        return new ResponseEntity<> ( courseService.update(course),HttpStatus.OK);
    }
    @DeleteMapping("/courses/{id}")
    public String  deleteCourseById(@PathVariable int id ){
        courseService.deleteById(id);
        return"Deleted..";
    }

}