/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deansoffice.controller;

import deansoffice.beans.Course;
import deansoffice.persistence.EntityManagerFactoryHolder;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

/**
 *
 * @author Miraxis
 */
@ManagedBean
public class CourseController {

    private List<Course> searchResult;

    public List<Course> getSearchResult() {
        
        readAllCourses();
        return searchResult;
    }
    
    public void readAllCourses(){
    
    EntityManager em=EntityManagerFactoryHolder.createEntityManagerDeansOffice();
        searchResult=em.createNamedQuery("Course.findAll").getResultList();
    }
}
