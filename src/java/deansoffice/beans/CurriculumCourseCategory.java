/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deansoffice.beans;

import deansoffice.persistence.IntKeyEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Miraxis
 */
@Entity
@Table(name = "curriculum_course_category")
@NamedQueries({
    @NamedQuery(name = "CurriculumCourseCategory.findAll", query = "SELECT c FROM CurriculumCourseCategory c"),
    @NamedQuery(name = "CurriculumCourseCategory.findById", query = "SELECT c FROM CurriculumCourseCategory c WHERE c.id = :id"),
    @NamedQuery(name = "CurriculumCourseCategory.findByName", query = "SELECT c FROM CurriculumCourseCategory c WHERE c.name = :name")})
public class CurriculumCourseCategory extends IntKeyEntity implements Serializable {
    private static final long serialVersionUID = 1L;
//    @Id
//    @Basic(optional = false)
//    @Column(name = "id")
//    private Long id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public CurriculumCourseCategory() {
    }

//    public CurriculumCourseCategory(Long id) {
//        this.id = id;
//    }
//
    public CurriculumCourseCategory(String name) {
//        this.id = id;
        this.name = name;
   }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurriculumCourseCategory)) {
            return false;
        }
        CurriculumCourseCategory other = (CurriculumCourseCategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deansoffice.beans.CurriculumCourseCategory[ id=" + id + " ]";
    }
    
}
