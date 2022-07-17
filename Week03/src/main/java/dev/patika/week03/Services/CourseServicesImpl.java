package dev.patika.week03.Services;

import dev.patika.week03.Dao.CourseDao;
import dev.patika.week03.Models.Course;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServicesImpl implements CourseService<Course> {
private final CourseDao<Course> courseDao;
//@Autowired
public CourseServicesImpl (@Qualifier("courseDaoJPAImpl") CourseDao<Course> courseDao){
    this.courseDao = courseDao;
}

    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Course update(Course object) {
        return null;
    }

    @Override
    public Course findById(int id) {

        return (Course) courseDao.findById(id);
    }

}