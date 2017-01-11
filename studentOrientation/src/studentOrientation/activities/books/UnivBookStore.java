package studentOrientation.activities.books;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;
import studentOrientation.util.carbonFootprint.TonnesCO2CarbonFootprint;
import studentOrientation.util.duration.MinutesDuration;
import studentOrientation.util.effort.CaloriesEffort;

/**
 * 
 * @author Ankush & Purva
 * concrete class of BuyBooksA for Univ Book Store choice
 *
 */
public class UnivBookStore extends BuyBooksA {
	
	/**
	 * UnivBookStore constructor
	 */
	public UnivBookStore(){
		super();
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Univ Book Store class constructor invoked",db);
		
		cost.setValue(1.05 * cost.getValue());
		duration = new MinutesDuration(5);
		cf = new TonnesCO2CarbonFootprint(1);
		effort = new CaloriesEffort(100);
		
		DebugLevel db1 = DebugLevel.ACTIVITIES;
		Logger.getUniqueInstance();
		Logger.writeMessage("Univ Book Store activity completed.",db1);
	}
	
	/**
	 * method to make string of object value
	 * @return s String
	 */
	public String toString(){
		String s = "Buy Books: University Book Store selected.\n";
		s = s + super.toString();
		return s;
	}
}