package dev.patika.week03.Services;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BaseServices <T> {
    List<T> findAll();
    T findById (int id);
    T save (T object);
    void deleteById(int id);
    T update (T object);
}
