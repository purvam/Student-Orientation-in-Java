package studentOrientation.activities.books;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;
import studentOrientation.util.carbonFootprint.TonnesCO2CarbonFootprint;
import studentOrientation.util.duration.MinutesDuration;
import studentOrientation.util.effort.CaloriesEffort;

/**
 * 
 * @author Ankush  & Purva
 * concrete class of BuyBooksA for Mando Books choice
 */
public class MandoBooks extends BuyBooksA {
	
	/**
	 * MandoBooks constructor
	 */
	public MandoBooks(){
		super();
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Mando Books class constructor invoked",db);
		
		duration = new MinutesDuration(20);
		cf = new TonnesCO2CarbonFootprint(5);
		effort = new CaloriesEffort(400);
		
		DebugLevel db1 = DebugLevel.ACTIVITIES;
		Logger.getUniqueInstance();
		Logger.writeMessage("Mando Books activity completed.",db1);
		
	}
	
	/**
	 * method to make string of object value
	 * @return s String
	 */
	public String toString(){
		String s = "Buy Books: Mando Books selected.\n";
		s = s + super.toString();
		return s;
	}
}