package studentOrientation.util;

/**
 * 
 * @author Ankush & Purva
 * Logger class
 *
 */
public class Logger{
    public static enum DebugLevel { 

    	CONSTR,
    	ACTIVITIES,
    	RESULTS,
    	NOTHING
                                   };
                                   
    private static DebugLevel debugLevel;
    private static volatile Logger UniqueInstance = null; 
    
    /**
     * Legger constructor
     */
    private Logger() { } 
    
    /**
     * method to get unique instance of Logger class
     * Singleton pattern is implemented
     * @param none
     * @return UniqueInstance
     */
    public static Logger getUniqueInstance() 
    {
       if(UniqueInstance==null) { 
        synchronized (Logger.class) {
            if (UniqueInstance == null) {
                UniqueInstance = new Logger();
            }
        }
       }      
        return UniqueInstance;
    }

    /**
     * method to set debug value
     * @param levelIn
     */
    public static void setDebugValue (int levelIn) {
		switch (levelIn) {
			case 0: debugLevel = DebugLevel.NOTHING; break;
			case 1: debugLevel = DebugLevel.ACTIVITIES; break;
			case 2: debugLevel = DebugLevel.RESULTS; break;
		  	case 3: debugLevel = DebugLevel.CONSTR; break;
		  	default:
		  		System.err.println("Wrong Logger debug level selected.");
		  		System.exit(0);
		}
    }

    /**
     * method to set debug value
     * @param levelIn
     */
    public static void setDebugValue (DebugLevel levelIn) {
    	debugLevel = levelIn;
    }

    /**
     * method to get and print message
     * @param message
     * @param levelIn
     */
    public static void writeMessage (String message,DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    /**
     * method to create string of object value
     * @return String 
     */
    public String toString() {
	return "Debug Level is " + debugLevel;
    }
    
    
}
