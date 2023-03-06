import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of messages.
 * Messages are numbered for external reference by a human user.
 * In this version, message numbers start at 0.
 * 
 * @author Abdul Razak
 * @version 19/02/2023
 */

public class Notebook
{
    // Storage for an arbitrary number of messages.
    
	private ArrayList<String> messageList;

    /**
     * Constructor - perform any initialisation that is required for the
     * notebook.
     */
    public Notebook()
    {
        messageList = new ArrayList<String>();
    }

    /**
     * This method stores (adds) a new message into the notebook.
     * @param message The note to be stored.
     */
    public void storeMessage(String message)
    {
        messageList.add(message); // the add() method is from the ArrayList class (Java Library class).
    }

    /**
     * This method returns the number of messages in the notebook. 
     * @return The number of messages currently in the notebook.
     */
    public int numberOfMessages()
    {
        return messageList.size(); // the size() method is from the ArrayList class (Java Library class).
    }
    
    /**
     * This method prints the number of messages currently in the Notebook.
     */
    
    public void printNumberOfMessages()
    {
    	System.out.println("You have "+ messageList.size()+ " messages in your Notebook.");
    	System.out.println();
    }

    /**
     * Show a message. This method prints a message at specific index.
     * @param noteNumber The number of the message to be shown.
     */
    public void showMessage(int messageNumber)
    {
        if(messageNumber < 0) {
            // This is not a valid message number, so do nothing. Please add a suitable error message.
        }
        else if(messageNumber < numberOfMessages()) { // The numberOf Messages() method is the one we have created above.
            // This is a valid message number, so we can print it.
        	
            System.out.println(messageList.get(messageNumber));
        }
        else {
            // This is not a valid message number, so do nothing.  Please add a suitable error message.
        }
    }
    
   


}
