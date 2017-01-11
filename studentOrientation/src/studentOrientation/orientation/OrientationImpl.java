package studentOrientation.orientation;

import studentOrientation.enums.BuyBooksChoice;
import studentOrientation.enums.CampusTourChoice;
import studentOrientation.enums.RegisterCoursesChoice;
import studentOrientation.enums.SelectDormChoice;
import studentOrientation.simpleFactory.SimpleBuyBooksFactory;
import studentOrientation.simpleFactory.SimpleCampusTourFactory;
import studentOrientation.simpleFactory.SimpleRegisterCoursesFactory;
import studentOrientation.simpleFactory.SimpleSelectDormFactory;
import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;
import studentOrientation.util.carbonFootprint.TonnesCO2CarbonFootprint;
import studentOrientation.util.cost.DollarCost;
import studentOrientation.util.duration.MinutesDuration;
import studentOrientation.util.effort.CaloriesEffort;

/**
 * 
 * @author Ankush & Purva
 * concrete class of OrientationA
 *
 */
public class OrientationImpl extends OrientationA {

	/**
	 * OrientationImpl constructor
	 * @param tourChoiceIn of enum type CampusTourChoice
	 * @param booksChoiceIn of enum type BuyBooksChoice
	 * @param dormChoiceIn of enum type SelectDormChoice
	 * @param coursesChoiceIn of enum type RegisterCoursesChoice
	 */
	public OrientationImpl(CampusTourChoice tourChoiceIn, BuyBooksChoice booksChoiceIn, SelectDormChoice dormChoiceIn, RegisterCoursesChoice coursesChoiceIn){
		
		DebugLevel db = DebugLevel.CONSTR;
		Logger.getUniqueInstance();
		Logger.writeMessage("Orientation Impl class constructor invoked",db);
		
		setDescription(tourChoiceIn,booksChoiceIn,dormChoiceIn,coursesChoiceIn);
		totalCost= new DollarCost(0);
		totalDuration= new MinutesDuration(0);
		totalEffort= new CaloriesEffort(0);
		totalCF= new TonnesCO2CarbonFootprint(0);
	}
	
	/**
	 * method to build campus tour
	 * @Override
	 */
	public void buildCampusTour() {
		myTour = SimpleCampusTourFactory.createTour(this.myTourChoice);
		totalCost.setValue(totalCost.getValue() + myTour.cost.getValue());
		totalDuration.setValue(totalDuration.getValue() + myTour.duration.getValue());
		totalEffort.setValue(totalEffort.getValue() + myTour.effort.getValue());
		totalCF.setValue(totalCF.getValue() + myTour.cf.getValue());
		System.out.println(myTour.toString());
	}
	
	/**
	 * method to build buy books
	 * @Override
	 */
	public void buildBuyBooks() {
		myBooks = SimpleBuyBooksFactory.createBuyBooks(this.myBooksChoice);
		totalCost.setValue(totalCost.getValue() + myBooks.cost.getValue());
		totalDuration.setValue(totalDuration.getValue() + myBooks.duration.getValue());
		totalEffort.setValue(totalEffort.getValue() + myBooks.effort.getValue());
		totalCF.setValue(totalCF.getValue() + myBooks.cf.getValue());
		System.out.println(myBooks.toString());
	}

	/**
	 * method to biuld select dorm
	 * @Override
	 */
	public void buildSelectDorm() {
		myDorm = SimpleSelectDormFactory.createSelectDorm(this.myDormChoice);
		totalCost.setValue(totalCost.getValue() + myDorm.cost.getValue());
		totalDuration.setValue(totalDuration.getValue() + myDorm.duration.getValue());
		totalEffort.setValue(totalEffort.getValue() + myDorm.effort.getValue());
		totalCF.setValue(totalCF.getValue() + myDorm.cf.getValue());
		System.out.println(myDorm.toString());
	}
	
	/**
	 * method to build register courses
	 * @Override
	 */
	public void buildRegisterCourses() {
		myCourses = SimpleRegisterCoursesFactory.createRegisterCourses(this.myCoursesChoice);
		totalCost.setValue(totalCost.getValue() + myCourses.cost.getValue());
		totalDuration.setValue(totalDuration.getValue() + myCourses.duration.getValue());
		totalEffort.setValue(totalEffort.getValue() + myCourses.effort.getValue());
		totalCF.setValue(totalCF.getValue() + myCourses.cf.getValue());
		System.out.println(myCourses.toString());
		
	}
}
