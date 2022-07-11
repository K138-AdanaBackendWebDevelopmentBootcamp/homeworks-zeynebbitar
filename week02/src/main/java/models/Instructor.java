package models;

import javax.persistence.*;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Instructor {
    @Id
    @GeneratedValue(generator = "Instroctur",strategy= GenerationType.SEQUENCE)
 @SequenceGenerator(name = "Instroctur",sequenceName = "INSTROCTUR_SEQ_ID")
    private  long instructorId;
    private String name;
    private String address;
    private long phoneNumber;
    @OneToMany(targetEntity = Course.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
private List<Course> courseList;

    public Instructor(String name, String address, long phoneNumber ) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public Instructor(String name, String address, long phoneNumber, List<Course> courseList) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.courseList = courseList;
    }

    public Instructor() {

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

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public static void getInstance() {
        return ;
    }

}
