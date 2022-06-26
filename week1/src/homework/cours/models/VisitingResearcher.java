package homework.cours.models;

import java.util.List;

public class VisitingResearcher    extends Instroctur {

    private double hourlySalary;

    public VisitingResearcher(double hourrlySalary) {
        this.hourlySalary = hourrlySalary;
    }
    public VisitingResearcher(String name, String address, String phoneNumber, double hourlySalary) {
        super(name, address, phoneNumber);

        this.hourlySalary = hourlySalary;
    }
    public VisitingResearcher(String name, String address, long phoneNumber, List<Course> courseList, double hourlySalary) {
        super(name, address, phoneNumber, courseList);
        this.hourlySalary = hourlySalary;

}
    public double gethourlySalary() {
        return hourlySalary;
        public void sethourlySalary( double hourlySalary);{
            this.hourlySalary = hourlySalary;
        }
    }


