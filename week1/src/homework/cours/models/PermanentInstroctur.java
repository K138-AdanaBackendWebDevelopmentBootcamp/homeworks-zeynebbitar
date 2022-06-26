package homework.cours.models;


import java.util.List;

public class PermanentInstroctur  extends Instroctur{
    private double fixedSalary;

    public PermanentInstroctur(String name, String address, String phoneNumber, List<Course> courseList, double fixedSalary) {
        super(name, address, phoneNumber, courseList);
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstroctur(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstroctur(String name, String address, String phoneNumber, double fixedSalary) {
        super(name, address, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

}
