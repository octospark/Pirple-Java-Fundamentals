package package1;

public class Plane extends Vehicle{
	private boolean isFlying = false;
	
	public Plane(String make, String model, int year, int weight) {
		super(make, model, year, weight);
	}
	
	public void Fly() {
		if (!this.needsMaintenance)
			this.isFlying = true;
		else
			System.out.println("The plane needs repair before flying. Won't start.");
	}
	
	public void Land() {
		if (this.isFlying) {
			this.isFlying = false;
			this.tripsSinceMaintenance += 1;
		}
		if (this.tripsSinceMaintenance >= 100) {
			this.needsMaintenance = true;
		}
	}
}
