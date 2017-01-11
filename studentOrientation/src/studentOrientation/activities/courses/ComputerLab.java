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
public class ComputerLab extends RegisterCoursesA {
	
	/**
	 * ComputerLab constructor
	 */
	public ComputerLab(){
		super();
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("ComputerLab class constructor invoked",db);
		
		duration = new MinutesDuration(5);
		cf = new TonnesCO2CarbonFootprint(2);
		effort = new CaloriesEffort(50);
		
		DebugLevel db1 = DebugLevel.ACTIVITIES;
		Logger.getUniqueInstance();
		Logger.writeMessage("ComputerLab activity completed.",db1);
	}

	/**
	 * method to make string of object value
	 * @return s String
	 */
	public String toString(){
		String s = "Registering Courses: Online in Computer Lab in EB selected.\n";
		s = s + super.toString();
		return s;
	}
}