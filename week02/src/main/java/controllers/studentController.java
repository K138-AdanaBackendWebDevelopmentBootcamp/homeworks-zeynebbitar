package controllers;

import models.Student;
import services.StudentService;

import java.util.List;

public class studentController {
    private services.StudentService StudentService = new StudentService();
    public List<Student> findAllStudents(){
        return StudentService.findAll();
    }
    public Student findStudentById(int id){
        return StudentService.findById(id);
    }
    public void saveStudent(Student student){
        StudentService.saveToDatabase(student);
    }
    public void deleteStudent(Student student){
        StudentService.deleteFromDatabase(student);
    }
    public void deleteStudentById(int id){
        StudentService.deleteFromDatabaseById(id);
    }
    public void updateStudent(Student student){
        StudentService.updateOnDatabase(student);
    }
}
