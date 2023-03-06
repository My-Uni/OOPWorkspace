
public class Heater {
	// Fields
	private int min;
	private int max;
	private int temperature;
	private int increment;

	// Constructor
	public Heater(int pMin, int pMax) {
		min = pMin;
		max = pMax;
		increment = 5;
		temperature = min + 10;
	}
	
	// Methods
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public int getIncrement() {
		return increment;
	}
	
	public void warmer() {
		if ((temperature + increment) <= max) {
			temperature += increment;
		}
		else {
			System.out.println("Error: You are trying to set the temperature past the max.");
		}
	}
	
	public void cooler() {
		if ((temperature - increment) >= min) {
			temperature -= increment;
		}
		else {
			System.out.println("Error: You are trying to set the temperature below the min.");
		}
	}
	
	public void setIncrement(int newIncrement) {
		if (newIncrement > 0) {
			increment = newIncrement;
		}
		else {
			System.out.println("Error: You are trying to set the new increment below 0.");
		}
	}
	
	public void printDetails() {
		System.out.println("# Heater Details"
				+ "\n#"
				+ "\n# Current Temperature: " + temperature
				+ "\n# Min Temp: " + min
				+ "\n# Max Temp: " + max
				+ "\n# Increment: " + increment);
	}
}
