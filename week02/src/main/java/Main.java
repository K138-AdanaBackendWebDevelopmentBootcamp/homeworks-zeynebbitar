import Utils.HibernateUtil;
import models.Course;
import models.PermanentInstructor;
import models.Student;
import models.VisitingResearcher;

import javax.persistence.EntityManager;
import java.time.LocalDate;
/**
* Main
 */
public class Main {
    public static void main(String[] args) {

        saveData();

    }
    public static void saveData(){
        EntityManager em = HibernateUtil.getEntityManager("mysqlZE");

        PermanentInstructor i1 = new PermanentInstructor("Koray","Adana",78976557862L,4000);
        PermanentInstructor i2 = new PermanentInstructor("Elif","Mersin",86586757557L,5000);
        PermanentInstructor i3 = new PermanentInstructor("Aya","Ankara",678674534635L,4500);
        PermanentInstructor i4 = new PermanentInstructor("Ahmet","Bursa",665454536475L,3700);
        VisitingResearcher i5 = new VisitingResearcher("Mahmut","Izmir",785420874521L,5500);

        Course cu = new Course("Matematik","M101",7,i1);
        Course cu1 = new Course("FİZik","F401",5,i2);
        Course cu2 = new Course("Kimya","k134",5,i2);
        Course cu3 = new Course("Türkçe","T147",2,i3);
        Course cu4 = new Course("Müzik","M423",2,i4);
        Course cu5 = new Course("İngilizce","İ123",2,i5);


        Student s =new Student("Zeynep","kız", LocalDate.of(2001,11,6),"Adana");
        Student s1 =new Student("Mustfa","Erkek", LocalDate.of(1999,2,20),"Ankara");
        Student s2 =new Student("Mecid","Erkek", LocalDate.of(1995, 2,27),"Bursa");
        Student s3 =new Student("Merve","kız", LocalDate.of(2000,1,29),"Ankara");
        Student s4 =new Student("Emine","kız", LocalDate.of(2000,11,6),"Mersin");
        Student s5=new Student("Ali","Erkek", LocalDate.of(1999,12,3),"Adana");


        try{
            em.getTransaction().begin();
            em.persist(i1);
            em.persist(i2);
            em.persist(i3);
            em.persist(i4);
            em.persist(i5);


            em.persist(cu);
            em.persist(cu1);
            em.persist(cu2);
            em.persist(cu3);
            em.persist(cu4);
            em.persist(cu5);

            em.persist(s);
            em.persist(s1);
            em.persist(s2);
            em.persist(s3);
            em.persist(s4);
            em.persist(s5);

            em.getTransaction().commit();

        }catch (Exception e){
            em.getTransaction().rollback();
        }
        finally {
            HibernateUtil.closeEntityManager(em);
        }
    }

}
