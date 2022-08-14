package dev.patika.graduation_project_school_management_system.util;

import dev.patika.graduation_project_school_management_system.model.Course;
import dev.patika.graduation_project_school_management_system.repository.ICourse_Repository;
import org.springframework.boot.CommandLineRunner;

public class InitializerRunner implements CommandLineRunner {
private final ICourse_Repository iCourse_repository;

    public InitializerRunner(ICourse_Repository iCourse_repository) {
        this.iCourse_repository = iCourse_repository;
    }

    @Override

    public void run(String... args) throws Exception {
       // if (Iterables.size(iCourse_repository.findAll())==0) {
            iCourse_repository.save(Course.builder().courseName("Maths").coursCode("M123").creditScore(6L).build());
            iCourse_repository.save(Course.builder().courseName("Music").coursCode("M166").creditScore(2L).build());
            iCourse_repository.save(Course.builder().courseName("Chemistry").coursCode("C386").creditScore(2L).build());
            iCourse_repository.save(Course.builder().courseName("English").coursCode("E432").creditScore(3L).build());
            iCourse_repository.save(Course.builder().courseName("Physics").coursCode("P213").creditScore(5L).build());
        //}

    }

}
