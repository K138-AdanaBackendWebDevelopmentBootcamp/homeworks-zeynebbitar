package dev.patika.week03.Dao;

public interface InstructorDao <Instructor> extends  BaseDao<Instructor> {
    Instructor findByPhoneNumber(Long phone_number);
      void deleteByPhoneNumber(Long phone_number);
    Instructor updateByPhoneNumber(Instructor instructor, Long phone_number);
}
