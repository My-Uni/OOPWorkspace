/**
 * A simple tester class to test the ClockDisplay class methods
 * @author A. Razak
 * version 12/02/2023
 */
public class ClockDisplayTester {
	
	// the main method where execution of the program starts.
	
	public static void main(String args[]){
		
	System.out.println(1 % 3);
		
	/* Exercise 1 Using the default constructor to create a clock display object.
	 * Notice what is displayed when using the default constructor.
		
		// Creating a ClockDisplay object "clock1" using the default constructor.
		
		ClockDisplay clock1 = new ClockDisplay();// Creating a clock default constructor.
		clock1.printTime();   //printing the time.
		clock1.timeTick();  //incrementing the minutes by 1 minutes.
		clock1.printTime();   //printing the time.
		clock1.timeTick();  //incrementing the minutes by 1 minutes.
		clock1.printTime();   //printing the time.
		
	*/
		
		
	/* Exercise 1 Using the default constructor to create a clock display object.
	 * Notice what is displayed when using the default constructor. 	
	
		// Creating a ClockDisplay object "clock2" using the parameter constructor.
		
		ClockDisplay clock2 = new ClockDisplay(23,59);
		clock2.printTime();   //printing the time.
		clock2.timeTick();  //incrementing the minutes by 1 minutes.
		clock2.printTime();   //printing the time.
		clock2.timeTick();  //incrementing the minutes by 1 minutes.
		clock2.printTime();   //printing the time.
		clock2.timeTick();  //incrementing the minutes by 1 minutes.
		clock2.printTime();   //printing the time.
		
	*/
		
	/* 
	 * Exercise 3
	 */
		
		ClockDisplay clock3 = new ClockDisplay(15,25, 0); 
		clock3.setTime(23, 59, 58);
		clock3.timeTick();
		clock3.printTime();
		clock3.timeTick();
		clock3.printTime();
		clock3.timeTick();
		clock3.printTime();
		clock3.timeTick();
		clock3.printTime();
		clock3.setTime(10, 50, 59) ;
		clock3.timeTick();
		clock3.printTime();
	}

}
