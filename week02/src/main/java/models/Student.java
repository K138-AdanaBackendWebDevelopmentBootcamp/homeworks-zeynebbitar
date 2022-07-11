package models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
@Entity
public class Student {
    @Id
    @GeneratedValue(generator = "Student",strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name ="Student",sequenceName = "STUDENT_SEQ_ID")


    private  long StudentId;
    private String name;
    private String gender;
    private LocalDate birthDate;
    private String address;

    public Student(String name, String gender, LocalDate birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;

    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getStudentId() {
        return StudentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(gender, student.gender) && birthDate.equals(student.birthDate) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, birthDate, address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                '}';
    }
}
