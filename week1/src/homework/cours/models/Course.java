package homework.cours.models;

import java.util.Objects;
import java.util.List;
private Instructor instructor;


public class Course {
    private String corseName;
    private String coursCode;
    private double creditScore;

    private List <Student> studentList;
    private Instructor instructor;

    public Course(String corseName, String coursCode, double creditScore) {
        this.corseName = corseName;
        this.coursCode = coursCode;
        this.creditScore = creditScore;
    }

    public Course() {
    }

    public String getCorseName() {
        return corseName;
    }

    public void setCorseName(String corseName) {
        this.corseName = corseName;
    }

    public String getCoursCode() {
        return coursCode;
    }

    public void setCoursCode(String coursCode) {
        this.coursCode = coursCode;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(coursCode, course.coursCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coursCode);
    }

    @Override
    public String toString() {
        return "Course{" +
                "corseName='" + corseName + '\'' +
                ", coursCode='" + coursCode + '\'' +
                ", creditScore=" + creditScore +
                ", studentList=" + studentList +
                ", instructor=" + instructor +
                '}';
    }
}
