CS542 Design Patterns
Fall 2016
PROJECT 3 README FILE

Due Date: Friday, Octomber 28, 2016
Submission Date: Friday, Octomber 28, 2016
Grace Period Used This Project: 0 Days
Grace Period Remaining: -
Author(s):
		Purva Myakal
		Ankush Arora
e-mail(s):
		pmyakal1@binghaton.edu
		aarora3@binghamton.edu


PURPOSE:
	To build a tool for student orientation that consists
	of taking a campus tour, buying books, selecting a dorm, and registering
	for courses. There is duration, cost, carbon footprint, and effort associated
	with each of these activities and their options. Also, design
	and develop the classes/interfaces that can be used for each student's orientation
	program. And write an example driver program for a specific student to calculate
	the total duration, cost, and effort of the orientation, based on her/his choices.


EXPLANATION:
	For this, we used builder pattern to build activities. And for creating these
	activities, we used static simple factory. 

PERCENT COMPLETE:
	"We believe we have completed 100% of this project."

PARTS THAT ARE NOT COMPLETE:
	None.

BUGS:
	None.

FILES:

 -arora_ankush_myakal_purva
   ---studentOrientation
     ----- build.xml
     ----- README.txt
     ----- src
          ---studentOrientation   
     	   ----------driver
				Driver.java
           ----------util
				Logger.java
				----------cost		//Cost interface & concrete implementation
					CostI.java
					DollarCost.java
				----------duration	//Duration interface & concrete implementation
					DurationI.java
					MinutesDuration.java
				----------effort	//Effort interface & concrete implementation
					EffortI.java
					CaloriesEffort.java
				----------carbonFootprint	//CarbonFootprint interface & concrete implementation
					CarbonFootprintI.java
					TonnesCO2CarbonFootprint.java
           ----------buildActivities	//interfaces containing build methods for each activity
				BuildBuyBooksI.java
				BuildCampusTourI.java
				BuildRegisterCoursesI.java
				BuildSelectDormI.java
           ----------activities	
				----------tour		//abstract & subclasses for Campus Tour activity
					CampusTourA.java
					BusRide.java
					OnFoot.java
				----------books		//abstract & subclasses for Buying Books activity
					BuyBooksA.java
					UnivBookStore.java
					MandoBooks.java
				----------dorm		//abstract & subclasses for Selecting Dorm activity
					SelectDormA.java
					LongQueue.java
					GamingContest.java
				----------courses	//abstract & subclasses for Registering Courses activity
					RegisterCoursesA.java
					Registrar.java
					ComputerLab.java
           ----------enums			//student choices as enumerations
				BuyBooksChoice.java
				CampusTourChoice.java
				RegisterCoursesChoice.java
				SelectDormChoice.java
           ----------orientation	//abstract & concrete class to enforce builder
				OrientationA.java
				OrientationImpl.java
           ----------simpleFactory	//each Simple static Factory containing create method for each activity
				SimpleBuyBooksFactory.java
				SimpleCampusTourFactory.java
				SimpleRegisterCoursesFactory.java
				SimpleSelectDormFactory.java
           ----------workshop		//construct method implementation for builder
				WorkshopI.java
				WorkshopImpl.java

SAMPLE OUTPUT:

	Campus Tour: On Foot selected.
	Cost: $ 0.1
	Duration: 50.0 minutes
	Effort: 500.0 calories
	Carbon Footprint: 1.0 tonnes of CO2
	
	Buy Books: Mando Books selected.
	Cost: $ 100.0
	Duration: 20.0 minutes
	Effort: 400.0 calories
	Carbon Footprint: 5.0 tonnes of CO2
	
	Selecting Dorm: Online Gaming Contest selected.
	Cost: $ 1020.0
	Duration: 30.0 minutes
	Effort: 200.0 calories
	Carbon Footprint: 5.0 tonnes of CO2
	
	Registering Courses: Submit form to Registrar selected.
	Cost: $ 97.0
	Duration: 50.0 minutes
	Effort: 400.0 calories
	Carbon Footprint: 1.0 tonnes of CO2
	
	Total Cost: $ 1217.1
	Total Duration: 150.0 minutes
	Total Effort: 1500.0 calories
	Total Carbon Footprint: 12.0 tonnes of CO2


TO COMPILE:

	Extract the tarball using command:

	> tar -xvf arora_ankush_myakal_purva_assign3.tar.gz

	Next, go to directory "arora_ankush_myakal_purva/studentOrientation" where the build file is and run the following command:

	> ant

TO RUN:

  Go to directory where the build file is, i.e., "arora_ankush_myakal_purva/studentOrientation" and run the following command:

	> ant -buildfile build.xml run


EXTRA CREDIT:

	N/A


BIBLIOGRAPHY:

	This serves as evidence that we are in no way intending Academic Dishonesty.
	Purva Myakal
	Ankush Arora


ACKNOWLEDGEMENT:

	None.