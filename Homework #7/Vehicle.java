package package1;

public class Vehicle {
	private String make;
	private String model;
	private int year;
	private int weight;
	protected boolean needsMaintenance = false;
	protected int tripsSinceMaintenance = 0;
	
	public Vehicle(String make, String model, int year, int weight) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.weight = weight;
	}

	protected String getMake() {
		return make;
	}

	protected void setMake(String make) {
		this.make = make;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected int getYear() {
		return year;
	}

	protected void setYear(int year) {
		this.year = year;
	}

	protected int getWeight() {
		return weight;
	}

	protected void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void Repair() {
		this.tripsSinceMaintenance = 0;
		this.needsMaintenance = false;
	}
}
