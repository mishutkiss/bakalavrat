package deansoffice.persistence;

/**
 * Holds a single instance of EntityManagerFactory.
  */
public class EntityManagerFactoryHolder {
    
    /**
     * Name of the persistence unit used by application
     */
    private static String DEANSOFFICE_PERSISTENCE_UNIT_NAME = "deansoffice";
     
    private static javax.persistence.EntityManagerFactory emfDeansOffice;
  
    static {
        emfDeansOffice = javax.persistence.Persistence.createEntityManagerFactory(DEANSOFFICE_PERSISTENCE_UNIT_NAME);
 
        assert emfDeansOffice != null;
 
    }

    public synchronized static javax.persistence.EntityManager createEntityManagerDeansOffice() {
        return emfDeansOffice.createEntityManager();
    }
 
}
