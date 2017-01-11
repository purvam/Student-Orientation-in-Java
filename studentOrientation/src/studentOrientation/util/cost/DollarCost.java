package studentOrientation.util.cost;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

/**
 * 
 * @author Ankush & Purva
 * Concrete class to implement CostI
 *
 */
public class DollarCost implements CostI {

	private double cost;
	
	/**
	 * DollarCost constructor 
	 * @param costIn
	 */
	public DollarCost(double costIn){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("DollarCost class constructor invoked",db);
		
		cost = costIn;
	}
	
	/**
	 * method to get value of cost
	 * @return double
	 * @Override
	 */
	public double getValue() {
		return cost;
	}

	/**
	 * method to set value of cost
	 * @param costIn
	 * @Override
	 */
	public void setValue(double costIn) {
		cost = costIn;
		
		DebugLevel db1 = DebugLevel.RESULTS;
		Logger.getUniqueInstance();
		Logger.writeMessage("Dollar Cost calculated.",db1);
	}

}
