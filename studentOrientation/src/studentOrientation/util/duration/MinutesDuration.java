package studentOrientation.util.duration;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

/**
 * 
 * @author Ankush & Purva
 * Concrete class to implement DurationI
 *
 */
public class MinutesDuration implements DurationI {

	private double minutes;
	
	/**
	 * MinutesDuration constructor
	 * @param minutesIn
	 */
	public MinutesDuration(double minutesIn){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("MinutesDuration class constructor invoked",db);
		
		minutes = minutesIn;
	}
	
	/**
	 * method to get value of duration
	 * @return double
	 * @override
	 */
	public double getValue() {
		return minutes;
	}

	/**
	 * method to set value of duration
	 * @param durationIn
	 * @Override
	 */
	public void setValue(double durationIn) {
		minutes = durationIn;
		
		DebugLevel db1 = DebugLevel.RESULTS;
		Logger.getUniqueInstance();
		Logger.writeMessage("Minutes Duration calculated.",db1);
	}

}
