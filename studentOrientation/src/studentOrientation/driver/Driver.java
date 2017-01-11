package studentOrientation.driver;

import studentOrientation.enums.BuyBooksChoice;
import studentOrientation.enums.CampusTourChoice;
import studentOrientation.enums.RegisterCoursesChoice;
import studentOrientation.enums.SelectDormChoice;
import studentOrientation.orientation.OrientationA;
import studentOrientation.orientation.OrientationImpl;
import studentOrientation.workshop.WorkshopI;
import studentOrientation.workshop.WorkshopImpl;

/**
 * 
 * @author Ankush & Purva
 *
 */
public class Driver {
	static int DEBUG_VALUE;
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		//validating number of command line arguments    
	    if(args.length != 0){
	      System.out.println("\nWrong number of command line arguments (see run instructions), terminating program.\n");
	      System.exit(0);
	    }
		
	    //initializing LOGGER VALUE to 0 (print only output)
	    //change value to:
	    //	0 - NOTHING (only output)
	    //	1 - ACTIVITIES
	    //	2 - RESULTS
	    //	3 - CONSTRUCTOR
	    DEBUG_VALUE=0;
	    
	    try{
	    	
	    	OrientationA stuCheck1 = new OrientationImpl(CampusTourChoice.ONFOOT, BuyBooksChoice.MANDOBOOKS, SelectDormChoice.GAMINGCONTEST , RegisterCoursesChoice.REGISTRAR);
			WorkshopI shop = new WorkshopImpl();
			shop.construct(stuCheck1);
			System.out.println(stuCheck1.toString());

	    }
	    catch(Exception ex){
	    	System.err.println("Exception caught in Driver, terminating program.");
	        ex.printStackTrace();
	        System.exit(0);
	    }
	    finally{
	    	
	    }
		
	}

}
