package deansoffice.beans;

import deansoffice.beans.CurriculumCourse;
import deansoffice.persistence.IntKeyEntity_;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-05-29T22:45:09")
@StaticMetamodel(CurriculumCourseSemester.class)
public class CurriculumCourseSemester_ extends IntKeyEntity_ {

    public static volatile SingularAttribute<CurriculumCourseSemester, CurriculumCourse> curriculumCourse;
    public static volatile SingularAttribute<CurriculumCourseSemester, Boolean> calculationGraphicalWork;
    public static volatile SingularAttribute<CurriculumCourseSemester, BigDecimal> hoursPerWeek;
    public static volatile SingularAttribute<CurriculumCourseSemester, Boolean> coursePaper;
    public static volatile SingularAttribute<CurriculumCourseSemester, Boolean> credit;
    public static volatile SingularAttribute<CurriculumCourseSemester, Boolean> courseProject;
    public static volatile SingularAttribute<CurriculumCourseSemester, Boolean> exam;
    public static volatile SingularAttribute<CurriculumCourseSemester, Short> semester;

}