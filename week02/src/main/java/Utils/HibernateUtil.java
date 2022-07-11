package Utils;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class HibernateUtil {

        static EntityManagerFactory emf = null;
        public static EntityManager getEntityManager(String persistenceUnitName){
            emf = Persistence.createEntityManagerFactory(persistenceUnitName);
            return emf.createEntityManager();
        }
        public static void closeEntityManager(EntityManager em){
            em.clear();
            em.close();
            emf.close();

        }



}
