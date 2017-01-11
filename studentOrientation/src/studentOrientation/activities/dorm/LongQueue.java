package studentOrientation.activities.dorm;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;
import studentOrientation.util.carbonFootprint.TonnesCO2CarbonFootprint;
import studentOrientation.util.duration.MinutesDuration;
import studentOrientation.util.effort.CaloriesEffort;

/**
 * 
 * @author Ankush & Purva
 * concrete class of SelectDormA
 *
 */
public class LongQueue extends SelectDormA {
	
	/**
	 * LongQueue constructor
	 */
	public LongQueue(){
		super();
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Long Queue class constructor invoked",db);
		
		duration = new MinutesDuration(50);
		cf = new TonnesCO2CarbonFootprint(2);
		effort = new CaloriesEffort(400);
		
		DebugLevel db1 = DebugLevel.ACTIVITIES;
		Logger.getUniqueInstance();
		Logger.writeMessage("Long Queue activity completed.",db1);
		
	}

	/**
	 * method to make string of object value
	 * @return s String
	 */
	public String toString(){
		String s = "Selecting Dorm: Long Queue selected.\n";
		s = s + super.toString();
		return s;
	}
}
