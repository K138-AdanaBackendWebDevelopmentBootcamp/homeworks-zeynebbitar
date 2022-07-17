package dev.patika.week03.Dao;

public interface CourseDao<Course> extends BaseDao<Course> {
void deleteByCode(String Code);

Course updateByCode(Course course , String code);

}
