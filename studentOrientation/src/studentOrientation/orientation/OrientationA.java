package studentOrientation.orientation;

import studentOrientation.activities.books.BuyBooksA;
import studentOrientation.activities.courses.RegisterCoursesA;
import studentOrientation.activities.dorm.SelectDormA;
import studentOrientation.activities.tour.CampusTourA;
import studentOrientation.buildActivities.BuildBuyBooksI;
import studentOrientation.buildActivities.BuildCampusTourI;
import studentOrientation.buildActivities.BuildRegisterCoursesI;
import studentOrientation.buildActivities.BuildSelectDormI;
import studentOrientation.enums.BuyBooksChoice;
import studentOrientation.enums.CampusTourChoice;
import studentOrientation.enums.RegisterCoursesChoice;
import studentOrientation.enums.SelectDormChoice;
import studentOrientation.util.carbonFootprint.CarbonFootprintI;
import studentOrientation.util.cost.CostI;
import studentOrientation.util.duration.DurationI;
import studentOrientation.util.effort.EffortI;

/**
 * 
 * @author Ankush & Purva
 * abstract class OrientationA
 *
 */
public abstract class OrientationA implements BuildBuyBooksI,BuildCampusTourI,BuildRegisterCoursesI,BuildSelectDormI {
	public CampusTourChoice myTourChoice;
	public BuyBooksChoice myBooksChoice;
	public SelectDormChoice myDormChoice;
	public RegisterCoursesChoice myCoursesChoice;
	
	protected CampusTourA myTour;
	protected BuyBooksA myBooks;
	protected SelectDormA myDorm;
	protected RegisterCoursesA myCourses;
	
	protected CostI totalCost;
	protected DurationI totalDuration;
	protected EffortI totalEffort;
	protected CarbonFootprintI totalCF;
	
	/**
	 * abstract methods to biuld activitie
	 */
	abstract public void buildCampusTour();
	abstract public void buildBuyBooks();
	abstract public void buildSelectDorm();
	abstract public void buildRegisterCourses();
	
	/**
	 * method to assign enum choices
	 * @param tourChoiceIn
	 * @param booksChoiceIn
	 * @param dormChoiceIn
	 * @param coursesChoiceIn
	 */
	public void setDescription(CampusTourChoice tourChoiceIn, BuyBooksChoice booksChoiceIn, SelectDormChoice dormChoiceIn, RegisterCoursesChoice coursesChoiceIn){
		myTourChoice = tourChoiceIn;
		myBooksChoice = booksChoiceIn;
		myDormChoice = dormChoiceIn;
		myCoursesChoice = coursesChoiceIn;
	}
	
	/**
	 * method to make string of object value
	 * @return String s
	 */
	public String toString(){
		String s = "Total Cost: $ " + totalCost.getValue() + "\nTotal Duration: " + totalDuration.getValue() + " minutes\nTotal Effort: " + totalEffort.getValue() + " calories\nTotal Carbon Footprint: " + totalCF.getValue() + " tonnes of CO2\n";
		return s;
	}
	
}
