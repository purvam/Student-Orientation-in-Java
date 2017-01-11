package studentOrientation.simpleFactory;

import studentOrientation.activities.courses.ComputerLab;
import studentOrientation.activities.courses.RegisterCoursesA;
import studentOrientation.activities.courses.Registrar;
import studentOrientation.enums.RegisterCoursesChoice;

/**
 * 
 * @author Ankush & Purva
 * Static simple factory to create RegisterCoursesA
 *
 */
public class SimpleRegisterCoursesFactory {
	
	/**
	 * method to create RegisterCoursesA object
	 * @param coursesChoiceIn
	 * @return RegisterCoursesA object
	 */
	public static RegisterCoursesA createRegisterCourses(RegisterCoursesChoice coursesChoiceIn){
		RegisterCoursesA myCourses = null;
		if(coursesChoiceIn == RegisterCoursesChoice.REGISTRAR){
			myCourses = new Registrar();
		}
		if(coursesChoiceIn == RegisterCoursesChoice.COMPUTERLAB){
			myCourses = new ComputerLab();
		}
		return myCourses;
	}
}
