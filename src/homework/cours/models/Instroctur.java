package homework.cours.models;

import java.util.ArrayList;
import java.util.List;

public class Instroctur {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Course> courseList=new ArrayList<>();

    public Instroctur(String name, String address, String phoneNumber, List<Course> courseList) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.courseList = courseList;
    }

    public Instroctur() {

    }

    public Instroctur(String name, String address, String phoneNumber) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
