package studentOrientation.activities.tour;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;
import studentOrientation.util.carbonFootprint.CarbonFootprintI;
import studentOrientation.util.cost.CostI;
import studentOrientation.util.duration.DurationI;
import studentOrientation.util.effort.EffortI;

/**
 * 
 * @author Ankush & Purva
 * Abstract class CampusTourA
 *
 */
public abstract class CampusTourA {
	public CostI cost;
	public DurationI duration;
	public EffortI effort;
	public CarbonFootprintI cf;
	
	/**
	 * CampusTourA constructor
	 */
	public CampusTourA(){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Campus Tour abstract class constructor invoked",db);
		
	}

	/**
	 * method to make string of object value
	 * @return s String
	 */
	public String toString(){
		String s = "Cost: $ " + cost.getValue() + "\nDuration: " + duration.getValue() + " minutes\nEffort: " + effort.getValue() + " calories\nCarbon Footprint: " + cf.getValue() + " tonnes of CO2\n";
		return s;
	}
}
