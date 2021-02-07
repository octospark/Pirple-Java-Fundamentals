package package1;

public class TestCarAndPlaneClasses {
	public static void main(String[] args) {
		// Below are three Car objects and we are making them take some trips
		// We are printing their state after each trip
		Car car1 = new Car("Audi", "Q7", 2016, 2400);
		Car car2 = new Car("Benz Mercedes", "C-Class", 2017, 2070);
		Car car3 = new Car("BMW", "X6", 2014, 2340);
		
		MakeTrip(car1);
		MakeTrip(car2);
		MakeTrip(car3);
		
		PrintState(car1);
		PrintState(car2);
		PrintState(car3);
		
		// Let's repair car1 and see its state after the repair
		car1.Repair();
		PrintState(car1);
		System.out.println();
		
		// Here is a plane object
		Plane plane = new Plane("Piper", "Cherokee 235", 1964, 710);
		
		// Let's fly it a number of times that exceeds the max number of flights before maintenance
		for (int i = 0; i < 105; i++) {
			plane.Fly();
			plane.Land();
			if (i > 97) {
				PrintState(plane);
			}
		}
		
		// Let's repair the plane and see its state
		System.out.println("\nAfter the repair the state of the plane is: ");
		plane.Repair();
		PrintState(plane);
	}
	
	// Drive the given car a random number of times
	public static void MakeTrip(Car car) {
		int trips = (int)(Math.random() * 40) + 80;
		for (int i = 0; i < trips; i++) {
			car.Drive();
			car.Stop();
		}
	}
	
	// Print the state of the car or the plane
	// Notice that the method can take any class that is a child of the Vehicle class
	public static void PrintState(Vehicle vehicle) {
		String maintenanceMsg = "";
		String message = "";
		if (vehicle.needsMaintenance)
			maintenanceMsg += "needs maintenance";
		else 
			maintenanceMsg += " doesn't need maintenance";
		message = vehicle.getMake() + ", " + vehicle.getModel() + " produced in " + vehicle.getYear() + 
				" weighing " + vehicle.getWeight() + " kg " + maintenanceMsg + " after " +
				vehicle.tripsSinceMaintenance + " trips.";
		System.out.println(message);
	}
}
