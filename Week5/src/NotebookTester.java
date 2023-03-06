
/**
 * A tester class to test the Notebook class's methods.
 * @author Abdul Razak
 * version 19/02/2023
 */


public class NotebookTester
{
	public static void main(String args[]){
		
		
	/* Week 6 */
	Notebook myNotebook = new Notebook(); //Creating object of type Notebook.

	// Exercise 1
	myNotebook.storeMessage("Hello World!");
	myNotebook.storeMessage("Hello Abdul!");
	myNotebook.storeMessage("Java!");
	myNotebook.storeMessage("Netflix > Amazon");
	myNotebook.storeMessage("Programmer vibes");
	myNotebook.listMessagesIterator();

	// Exercise 2
	myNotebook.removeMessages("Hello");
	myNotebook.listMessagesIterator();

	}
	
}