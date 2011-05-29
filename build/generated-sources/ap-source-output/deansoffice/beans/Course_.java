package deansoffice.beans;

import deansoffice.beans.CurriculumCourse;
import deansoffice.persistence.IntKeyEntity_;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-05-29T22:45:09")
@StaticMetamodel(Course.class)
public class Course_ extends IntKeyEntity_ {

    public static volatile SingularAttribute<Course, String> name;
    public static volatile SingularAttribute<Course, String> abbr;
    public static volatile SingularAttribute<Course, String> code;
    public static volatile ListAttribute<Course, CurriculumCourse> curriculumCourseList;

}