package deansoffice.persistence;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Interface that should be implemented by any persistent entity which has simple
 * primary key of integer type.
 */
@MappedSuperclass
public class IntKeyEntity {

    /**
     * Entity identifier
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Integer id;

    //- Properties -------------------------------------------------------------
    public Integer getId() {
        return this.id;
    }
}
