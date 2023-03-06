/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author A. Razak
 * @version 12/02/2023
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int newHour, int newMinute, int newSecond)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(newHour, newMinute, newSecond);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTickMin()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }
    
    /**
     * This method should get called once every second - it makes
     * the clock display go one second forward.
     */
    public void timeTick()
    {
        seconds.increment();
        if(seconds.getValue() == 0) {  // it just rolled over! (minutes)
            minutes.increment();
        }
        if((seconds.getValue() == 0) && (minutes.getValue() == 0)) {  // it just rolled over! (hours)
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int newHour, int newMinute, int newSecond)
    {
        hours.setValue(newHour);
        minutes.setValue(newMinute);
        seconds.setValue(newSecond);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
    	 System.out.println(displayString);
        return displayString;
        
    }
    
    public void printTime()
    {
    	System.out.println(displayString);

        
    }
    
    /**
     * Update the internal string that represents the display.
     */
    public void updateDisplay()
    
    {
    	/* 
    	 *  Exercise 6
    	 */
    	
    	// Temp and Local Variables
    	// temphour: a temp variable to store our hour as an int, hour: our 'final' readable string hour
    	int temphour = Integer.parseInt(hours.getDisplayValue());
    	String hour = hours.getDisplayValue();
    	String ampm = "am";
    	
    	// If our time is in pm (above 12)
    	if (temphour > 12) {
    		// Get our 12 hour clock time by minusing our double digit number by 12
    		temphour -= 12;
    		hour = Integer.toString(temphour);
    		ampm = "pm";
    	}
    	// As 0 minus 12 won't work in this example and neither will 00 meet our 12 hour clock requirement, we will have a seperate selection statement for it
    	else if (temphour == 0) {
    		hour = "12";
    		ampm = "am";
    	}
    	
        displayString = hour + ":" + 
                        minutes.getDisplayValue() + ":" +
                        seconds.getDisplayValue() + " " +
                        ampm;
       
    }
    
 
}
