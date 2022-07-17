package dev.patika.week03.Models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
    public class Course {
   @Id
    @GeneratedValue(generator = "course", strategy= GenerationType.SEQUENCE)
   @SequenceGenerator(name = "Course",sequenceName = "COURSE_SEQ_ID")
    private  long courseId;
    private String corseName;
    private String coursCode;
    private double creditScore;


    @ManyToMany(targetEntity = Student.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List <Student> studentList;
    @ManyToOne (fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Instructor.class)
    private Instructor instructor;


    public Course(String corseName, String coursCode, double creditScore, Instructor instructor) {
        this.corseName = corseName;
        this.coursCode = coursCode;
        this.creditScore = creditScore;
        this.instructor = instructor;
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
                ", courseCode='" + coursCode + '\'' +
                ", creditScore=" + creditScore +
                ", studentList=" + studentList +
                ", instructor=" + instructor +
                '}';
    }
}
