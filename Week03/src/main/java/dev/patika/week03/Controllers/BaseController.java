package dev.patika.week03.Controllers;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseController<T> {
   ResponseEntity <List<T>> getAll();
    ResponseEntity<T> getById (int id);
    ResponseEntity<T> deleteById( int id);
    ResponseEntity<T>  updateById (T t , int id );
}
