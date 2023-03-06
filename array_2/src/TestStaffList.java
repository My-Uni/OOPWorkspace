/**
 * A simple tester class to test the StaffList class methods
 * @author A. Razak
 * version 17/03/2019
 */

public class TestStaffList {
	
	public static void main(String args[]){
		
		StaffList list = new StaffList();
		
		list.addPerson(new Person("John", 20));
		list.addPerson(new Person("Mary", 30));
		list.addPerson(new Person("Peter", 40));
		list.addPerson(new Person("Jane", 50));
		list.addPerson(new Person("Paul", 60));

		// list.showStaffInAgeRange(0, 100);

		list.lowestAge();
		list.highestAge();
	}

}
