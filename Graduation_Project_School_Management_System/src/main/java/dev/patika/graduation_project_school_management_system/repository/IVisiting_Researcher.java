package dev.patika.graduation_project_school_management_system.repository;

import dev.patika.graduation_project_school_management_system.model.VisitingResearcher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IVisiting_Researcher extends CrudRepository <VisitingResearcher, Long> {
    void deleteByHourlySalary(double hourly_Salary);
    List<VisitingResearcher> findTop3ByHourlySalary (double top_salary);

}
