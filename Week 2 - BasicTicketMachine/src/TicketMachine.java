/**
 * TicketMachine class models a basic ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a basic machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author A.Razak
 * @version 17/01/2021
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int ticketPrice;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Constructor that create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int newTicketPrice)
    {
        ticketPrice = newTicketPrice;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getTicketPrice()
    {
        return ticketPrice;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
    	
        return balance;
    }

    /**
     * Receive an amount of money in pounds from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
        System.out.println("# You have inserted: " + amount + " Pounds");
        System.out.println();
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("############################");
        System.out.println("# You have bought a ticket");
        System.out.println("# Ticket cost is: "+ ticketPrice + " Pounds");
        System.out.println("############################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
    
   /**
    * Print the balance.
    */
    public void printBalance() {
    	
    	System.out.println("##################");
        System.out.println("# Printing the balance");
        System.out.println("# The balance is: " + balance + " Pounds");
        System.out.println("##################");
        System.out.println();
    	
    }
}
