package studentOrientation.activities.courses;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;
import studentOrientation.util.carbonFootprint.TonnesCO2CarbonFootprint;
import studentOrientation.util.duration.MinutesDuration;
import studentOrientation.util.effort.CaloriesEffort;

/**
 * 
 * @author Ankush & Purva
 * concrete class of RegisterCoursesA
 *
 */
public class Registrar extends RegisterCoursesA {
	
	/**
	 * Registrar constructor
	 */
	public Registrar(){
		super();
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Registrar class constructor invoked",db);
		
		cost.setValue(0.97 * cost.getValue());
		duration = new MinutesDuration(50);
		cf = new TonnesCO2CarbonFootprint(1);
		effort = new CaloriesEffort(400);
		
		DebugLevel db1 = DebugLevel.ACTIVITIES;
		Logger.getUniqueInstance();
		Logger.writeMessage("Registrar activity completed.",db1);
	}
	

	/**
	 * method to make string of object value
	 * @return s String
	 */
	public String toString(){
		String s = "Registering Courses: Submit form to Registrar selected.\n";
		s = s + super.toString();
		return s;
	}
}