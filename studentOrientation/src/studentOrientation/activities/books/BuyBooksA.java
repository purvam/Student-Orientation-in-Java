package studentOrientation.activities.books;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;
import studentOrientation.util.carbonFootprint.CarbonFootprintI;
import studentOrientation.util.cost.CostI;
import studentOrientation.util.cost.DollarCost;
import studentOrientation.util.duration.DurationI;
import studentOrientation.util.effort.EffortI;

/**
 * 
 * @author Ankush & Purva
 * Abstract class to buy books
 *
 */
public abstract class BuyBooksA {
	public CostI cost;
	public DurationI duration;
	public EffortI effort;
	public CarbonFootprintI cf;
	
	/**
	 * BuyBooksA constructor
	 */
	public BuyBooksA(){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Buy Books abstract class constructor invoked",db);
		
		cost = new DollarCost(100);
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
