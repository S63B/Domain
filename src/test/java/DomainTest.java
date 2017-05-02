import com.S63B.domain.Entities.Car;
import com.S63B.domain.Entities.LicensePlate;
import junit.framework.TestCase;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DomainTest extends TestCase {

    private EntityManager em;

    public void setUp() throws Exception {
        super.setUp();

        em = Persistence.createEntityManagerFactory("HibernatePersistenceUnit").createEntityManager();
    }

    public void testPolController() throws Exception {
        em.getTransaction().begin();

        Object o = new LicensePlate();

        em.persist(o);

        o = new Car();

        em.persist(o);

        em.getTransaction().commit();
    }
}