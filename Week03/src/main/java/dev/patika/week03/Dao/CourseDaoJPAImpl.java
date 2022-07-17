package dev.patika.week03.Dao;

import dev.patika.week03.Exceptions.AlreadyExists;
import dev.patika.week03.Models.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class CourseDaoJPAImpl implements  CourseDao <Course> {
EntityManager entityManager;

    //@Autowired
    public CourseDaoJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void deleteById(int id) {
      Course  course =  entityManager.createQuery("from Course c WHERE c.id =:Param",Course.class)
                .setParameter("Param",id).getSingleResult();
      if (course == null)
          throw new AlreadyExists(  "No Course with id "+ id);
      entityManager.remove(course);
    }
    @Override
    public Course update(Course object, int id) {
        return null;
    }

    @Override
      @Transactional(readOnly = true)
    public List<Course> findAll() {
        return entityManager.createQuery( "from Course",Course.class).getResultList();
    }
    @Override
    public Course findById(int id) {

        return null;
    }
    @Override
    @Transactional
    public Course save(Course course) {
        return null;
    }

    @Override
    public void deleteByCode(String Code) {
    }

    @Override
    public Course updateByCode(Course course, String code) {

       Course  course1  =entityManager.createQuery("from Course c WHERE c.coursCode =:CourseCode ", Course.class)
                .setParameter("CourseCode",code).getSingleResult();
        if (course1 != null  )  {
            throw  new ClassCastException(" " + course.getCreditScore());
        }
        return entityManager.merge(course);
    }

}
