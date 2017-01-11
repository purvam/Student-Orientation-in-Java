package studentOrientation.workshop;

import studentOrientation.orientation.OrientationA;
import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

/**
 * 
 * @author Ankush & Purva
 * Concrete class to implement WorkshopI
 *
 */
public class WorkshopImpl implements WorkshopI {
	
	/**
	 * WorkshopImpl constructor
	 */
	public WorkshopImpl(){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("WorkshopImpl class constructor invoked",db);
		
	}
	
	/**
	 * method to construct activities
	 * @param myChecklistIn
	 * @override
	 */
	public void construct(OrientationA myChecklistIn){
		myChecklistIn.buildCampusTour();
		myChecklistIn.buildBuyBooks();
		myChecklistIn.buildSelectDorm();
		myChecklistIn.buildRegisterCourses();
	}
}
