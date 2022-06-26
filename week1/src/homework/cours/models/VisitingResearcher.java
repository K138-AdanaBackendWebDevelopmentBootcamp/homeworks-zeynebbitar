package homework.cours.models;

import java.util.List;

public class VisitingResearcher  extends Instroctur {
    private double hourlySalary;

    public VisitingResearcher(String name, String address, String phoneNumber, List<Course> courseList, double hourlySalary) {
        super(name, address, phoneNumber, courseList);
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher(String name, String address, String phoneNumber, double hourlySalary) {
        super(name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
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

