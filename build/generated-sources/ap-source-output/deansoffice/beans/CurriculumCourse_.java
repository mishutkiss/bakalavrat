package deansoffice.beans;

import deansoffice.beans.Course;
import deansoffice.beans.CurriculumCourseSemester;
import deansoffice.persistence.IntKeyEntity_;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-05-29T22:45:09")
@StaticMetamodel(CurriculumCourse.class)
public class CurriculumCourse_ extends IntKeyEntity_ {

    public static volatile SingularAttribute<CurriculumCourse, Course> course;
    public static volatile SingularAttribute<CurriculumCourse, Short> selfStudyHours;
    public static volatile ListAttribute<CurriculumCourse, CurriculumCourseSemester> curriculumCourseSemesterList;
    public static volatile SingularAttribute<CurriculumCourse, BigDecimal> ectsCredits;
    public static volatile SingularAttribute<CurriculumCourse, Short> inclassHours;
    public static volatile SingularAttribute<CurriculumCourse, Short> totalHours;
    public static volatile SingularAttribute<CurriculumCourse, Short> lectureHours;
    public static volatile SingularAttribute<CurriculumCourse, Short> laboratoryClassHours;
    public static volatile SingularAttribute<CurriculumCourse, Short> practicalClassHours;

}