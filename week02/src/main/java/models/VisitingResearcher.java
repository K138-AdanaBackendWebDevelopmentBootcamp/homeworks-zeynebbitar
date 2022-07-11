package models;

import javax.persistence.Entity;
import java.util.List;
@Entity
public class VisitingResearcher  extends Instructor {
    private double hourlySalary;

    public VisitingResearcher(String name, String address, long  phoneNumber, List<Course> courseList, double hourlySalary) {
        super(name, address, phoneNumber, courseList);
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(String name, String address, long  phoneNumber, double hourlySalary) {
        super(name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher() {
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hourlySalary=" + hourlySalary +
                '}';
    }
}

