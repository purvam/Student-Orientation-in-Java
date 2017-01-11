package studentOrientation.simpleFactory;

import studentOrientation.activities.tour.BusRide;
import studentOrientation.activities.tour.CampusTourA;
import studentOrientation.activities.tour.OnFoot;
import studentOrientation.enums.CampusTourChoice;

/**
 * 
 * @author Ankush & Purva
 * Static simple factory to create CampusTourA
 *
 */
public class SimpleCampusTourFactory {
	
	/**
	 * method to create CampusTourA object
	 * @param tourChoiceIn
	 * @return CampusTourA object
	 */
	public static CampusTourA createTour(CampusTourChoice tourChoiceIn){
		CampusTourA myTour = null;
		if(tourChoiceIn == CampusTourChoice.BUSRIDE){
			myTour = new BusRide();
		}
		if(tourChoiceIn == CampusTourChoice.ONFOOT){
			myTour = new OnFoot();
		}
		return myTour;
	}
}
