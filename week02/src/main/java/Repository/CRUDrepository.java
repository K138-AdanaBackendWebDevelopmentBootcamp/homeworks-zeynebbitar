package Repository;

import Utils.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.List;

public interface CRUDrepository <T> {
    EntityManager em = HibernateUtil.getEntityManager("mysqlZE");
    List<T> findAll();
    T findById(int id);
    void saveToDatabase(T object);
    void deleteFromDatabase(T object);
    void deleteFromDatabaseById(int id);
    void updateOnDatabase(T object);



}
