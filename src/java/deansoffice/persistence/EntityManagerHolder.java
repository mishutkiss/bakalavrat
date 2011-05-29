package deansoffice.persistence;

import javax.persistence.EntityManager;

/**
 * Holds EntityManager instance sharable across controllers.
 * This object is injected by JSF into proper request-scoped controllers.
 */
public class EntityManagerHolder {

    /**
     * Instance of EntityManager got from EntityManagerFactoryHolder
     */
    private EntityManager emDO;

    public EntityManager getEmDO() {
        return emDO;
    }

    public EntityManagerHolder() {
        emDO = EntityManagerFactoryHolder.createEntityManagerDeansOffice();
    }
}