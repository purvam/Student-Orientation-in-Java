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
public class BusRide extends CampusTourA {
	
	/** 
	 * BusRide constructor
	 */
	public BusRide(){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Bus Ride class constructor invoked",db);
		
		cost = new DollarCost(2);
		duration = new MinutesDuration(10);
		cf = new TonnesCO2CarbonFootprint(10);
		effort = new CaloriesEffort(50);
		
		DebugLevel db1 = DebugLevel.ACTIVITIES;
		Logger.getUniqueInstance();
		Logger.writeMessage("Bus Ride activity completed.",db1);
	}

	/**
	 * method to make string of object value
	 * @return s String
	 */
	public String toString(){
		String s = "Campus Tour: Bus Ride selected.\n";
		s = s + super.toString();
		return s;
	}
}
