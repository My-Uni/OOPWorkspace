/**
 * Tester class to test the ticket machine and its methods
 * @author A. Razak
 * @version 17/01/2021
 *
 */
public class TicketMachineTester {
	
	/**
	 * The maim method.
	 * @param args
	 */
	 public static void main (String[] args)
	 {
	 
		 TicketMachine tm1;
		 tm1 = new TicketMachine(200);
		 
		
		 tm1.insertMoney(300);
		 tm1.getBalance();
		 tm1.printBalance();
		 tm1.insertMoney(200);
		 tm1.printBalance();
		 tm1.printTicket();
		 tm1.getBalance();
		 tm1.printBalance();
		
	 }

}
