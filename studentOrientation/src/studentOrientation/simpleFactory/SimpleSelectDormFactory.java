package studentOrientation.simpleFactory;

import studentOrientation.activities.dorm.GamingContest;
import studentOrientation.activities.dorm.LongQueue;
import studentOrientation.activities.dorm.SelectDormA;
import studentOrientation.enums.SelectDormChoice;

/**
 * 
 * @author Ankush & Purva
 * Static simple factory to create SelectDormA
 *
 */
public class SimpleSelectDormFactory {
	
	/**
	 * method to create SelectDormA object
	 * @param dormChoiceIn
	 * @return SelectDormA object
	 */
	public static SelectDormA createSelectDorm(SelectDormChoice dormChoiceIn){
		SelectDormA myDorm = null;
		if(dormChoiceIn == SelectDormChoice.LONGQUEUE){
			myDorm = new LongQueue();
		}
		if(dormChoiceIn == SelectDormChoice.GAMINGCONTEST){
			myDorm = new GamingContest();
		}
		return myDorm;
	}
}
