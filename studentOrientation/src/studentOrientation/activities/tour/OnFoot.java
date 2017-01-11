package studentOrientation.activities.tour;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;
import studentOrientation.util.carbonFootprint.TonnesCO2CarbonFootprint;
import studentOrientation.util.cost.DollarCost;
import studentOrientation.util.duration.MinutesDuration;
import studentOrientation.util.effort.CaloriesEffort;

/**
 * 
 * @author Ankush & Purva
 * concrete class of CampusTourA
 *
 */
public class OnFoot extends CampusTourA {
	
	/**
	 * OnFoot constructor
	 */
	public OnFoot(){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("On foot class constructor invoked",db);
		
		cost = new DollarCost(0.1);
		duration = new MinutesDuration(50);
		cf = new TonnesCO2CarbonFootprint(1);
		effort = new CaloriesEffort(500);
		
		DebugLevel db1 = DebugLevel.ACTIVITIES;
		Logger.getUniqueInstance();
		Logger.writeMessage("On foot activity completed.",db1);
	}
	
	/**
	 * method to make string of object value
	 * @return s String
	 */
	public String toString(){
		String s = "Campus Tour: On Foot selected.\n";
		s = s + super.toString();
		return s;
	}
}