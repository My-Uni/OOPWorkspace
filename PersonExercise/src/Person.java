
public class Person {
	// Fields
	private String name;
	private int age;
	
	// Constructor
	public Person(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public int getAge() {
		return age;
	}
	
	public void printDetails() {
		System.out.println("# Person Details"
				+ "\n#"
				+ "\n# Name: " + name
				+ "\n# Age: " + age);
	}
}
