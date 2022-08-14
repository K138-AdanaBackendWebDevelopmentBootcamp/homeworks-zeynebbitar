package dev.patika.graduation_project_school_management_system.service;

import dev.patika.graduation_project_school_management_system.model.VisitingResearcher;
import dev.patika.graduation_project_school_management_system.repository.IVisiting_Researcher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Visiting_Researcher_Service {
    final IVisiting_Researcher repository;

    public Visiting_Researcher_Service(IVisiting_Researcher repository) {
        this.repository = repository;
    }

    public List<VisitingResearcher> findAll() {
        List<VisitingResearcher> visitingResearcherList = new ArrayList<>();
        Iterable <VisitingResearcher> visitingResearcherIterable =repository.findAll();
        visitingResearcherIterable.iterator().forEachRemaining(visitingResearcherList::add);   // stream api
        return visitingResearcherList;
    }
    public VisitingResearcher save (VisitingResearcher visitingResearcher )  {
        return repository.save(visitingResearcher);
    }
    public VisitingResearcher update (VisitingResearcher visitingResearcher){
        return repository.save(visitingResearcher);
    }
    public VisitingResearcher findById (Long id ){
        return repository.findById(id).get();
    }
    public void delete (VisitingResearcher visitingResearcher ) {
        repository.delete(visitingResearcher);
    }
    public void deleteById (Long id){
        repository.deleteById(id);
    }

    public void deleteByHourlySalary(double hourlySalary) {
        repository.deleteByHourlySalary(hourlySalary);}

    public List<VisitingResearcher> findTop3ByFixedSalary(){
        Iterable<VisitingResearcher> visitingResearcherIterable = repository.findTop3ByHourlySalary(2000);
        List<VisitingResearcher> topThree = new ArrayList<>();
        visitingResearcherIterable.forEach(topThree::add);
        return topThree;
    }
}

