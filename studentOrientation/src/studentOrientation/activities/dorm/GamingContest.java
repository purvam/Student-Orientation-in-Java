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
public class GamingContest extends SelectDormA {
	
	/**
	 * GamingContest constructor
	 */
	public GamingContest(){
		super();
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Gaming contest class constructor invoked.",db);
		
		cost.setValue(1.02 * cost.getValue());
		duration = new MinutesDuration(30);
		cf = new TonnesCO2CarbonFootprint(5);
		effort = new CaloriesEffort(200);
		
		DebugLevel db1 = DebugLevel.ACTIVITIES;
		Logger.getUniqueInstance();
		Logger.writeMessage("Gaming contest activity completed.",db1);
		
	}

	/**
	 * method to make string of object value
	 * @return s String
	 */
	public String toString(){
		String s = "Selecting Dorm: Online Gaming Contest selected.\n";
		s = s + super.toString();
		return s;
	}
}