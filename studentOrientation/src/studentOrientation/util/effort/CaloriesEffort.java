package studentOrientation.util.effort;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

/**
 * 
 * @author Ankush & Purva
 * Concrete class to implement EffortI
 *
 */
public class CaloriesEffort implements EffortI {

	private double effort;
	
	/**
	 * CaloriesEffort constructor
	 * @param effortIn
	 */
	public CaloriesEffort(double effortIn){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Calories Effort class constructor invoked",db);
		
		effort = effortIn;
		
	}
	
	/**
	 * method to get value of effort
	 * @return double
	 * @Override
	 */
	public double getValue() {
		return effort;
	}

	/**
	 * method to set value of effort
	 * @param effortIn
	 * @Override
	 */
	public void setValue(double effortIn) {
		effort = effortIn;
		
		DebugLevel db1 = DebugLevel.RESULTS;
		Logger.getUniqueInstance();
		Logger.writeMessage("Calories Effort calculated.",db1);
	}
}
