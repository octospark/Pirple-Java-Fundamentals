package package1;

public class Car extends Vehicle{
	private boolean isDriving = false;
	
	public Car(String make, String model, int year, int weight) {
		super(make, model, year, weight);
	}
	
	public void Drive() {
		this.isDriving = true;
	}
	
	public void Stop() {
		if (this.isDriving) {
			this.isDriving = false;
			this.tripsSinceMaintenance += 1;
		}
		if (this.tripsSinceMaintenance >= 100)
			this.needsMaintenance = true;
	}
	
	
	
	public boolean getIsDriving() {
		return this.isDriving;
	}
}
