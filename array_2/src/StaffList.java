
/**
 * A simple class to track the staff working for a small company. It
 * uses an array to store the name and age of each member of staff.
 * 
 * @author Abdul Razak 
 * @version 1.0
 */
public class StaffList
{
    // instance variables
    private Person[] people;
    private int numPeople;
    
    /**
     * This constructor will create an array to store upto 5 staff
     */
    public StaffList()
    {
        // create an array of Person objects
        people = new Person[5];
        numPeople = 0;
    }
    
     /**
     * This constructor can be used to create arrays not less than 5 elements
     * to store upto  staff details
     */
   public StaffList(int maxNbrStaff)
    {
       if(maxNbrStaff < 5){
           maxNbrStaff = 5;
        }
        // create an array of Person objects
        people = new Person[maxNbrStaff];
        numPeople = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  p   the Person to add
     */
    public void addPerson(Person p)
    {
        // put your code here
        people[numPeople] = p;
        numPeople++;
    }
    
    public int getNbrPeople(){
        return numPeople;
    }
    
    /**
     * Display the people in the array
     */
    public void showAllStaff()
    {
        for(Person p : people)        {
            System.out.println(p);
        }
    }

    public void showStaffInAgeRange(int minAge, int maxAge)
    {
        for(Person p : people)        {
            if(p.getAge() >= minAge && p.getAge() <= maxAge){
                System.out.println(p.getName() + " is " + p.getAge() + " years old");
            }
        }
    }

    public void lowestAge() {
        int lowestAge = 100;
        Person lowest = null;
        for(Person p : people)        {
            if(p.getAge() < lowestAge){
                lowestAge = p.getAge();
                lowest = p;
            }
        }

        System.out.println("The lowest age is " + lowestAge + " years old. Their name is " + lowest.getName());
    }

    public void highestAge() {
        int highestAge = 0;
        Person highest = null;
        for(Person p : people)        {
            if(p.getAge() > highestAge){
                highestAge = p.getAge();
                highest = p;
            }
        }

        System.out.println("The highest age is " + highestAge + " years old. Their name is " + highest.getName());
    }
}
