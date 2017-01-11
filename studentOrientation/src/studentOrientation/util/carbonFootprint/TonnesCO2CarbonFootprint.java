package studentOrientation.util.carbonFootprint;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

/**
 * 
 * @author Ankush & Purva
 * Concrete class to implement CarbonFootprintI
 *
 */
public class TonnesCO2CarbonFootprint implements CarbonFootprintI {

	private double carbonFootprint;
	
	/**
	 * TonnesCO2CarbonFootprint constructor
	 * @param carbonFootprintIn
	 */
	public TonnesCO2CarbonFootprint(double carbonFootprintIn){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("TonnesCO2CarbonFootprint class constructor invoked",db);
		
		carbonFootprint = carbonFootprintIn;
	}
	
	/**
	 * method to get value of carbonFootprint
	 * @return double
	 * @Override
	 */
	public double getValue() {
		return carbonFootprint;
	}

	/**
	 * method to set value of carbonFootprint
	 * @Override
	 * @param carbonFootprintIn
	 */
	public void setValue(double carbonFootprintIn) {
		carbonFootprint = carbonFootprintIn;
		
		DebugLevel db1 = DebugLevel.RESULTS;
		Logger.getUniqueInstance();
		Logger.writeMessage("Tonnes CO2 CarbonFootprint calculated.",db1);
	}
}
