package package1;

import java.util.Scanner;

public class Sphere {
	private double radius;
	
	public Sphere() {
		this.radius = 0;
	}
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double getDiameter() {
		return this.radius * 2;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * this.radius; 
	}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(this.radius, 2);
	}
	
	public double getVolume() {
		return 4.0 / 3 * Math.PI * Math.pow(this.radius, 3);
	}
	
	/* Test the properties of this class*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the sphere: ");
		double radius = input.nextDouble();
		
		Sphere sphere = new Sphere(radius);
		// Print the properties of the sphere
		System.out.println("The diameter of the sphere is: " + sphere.getDiameter() + " units");
		System.out.println("The circumference of the sphere is: " + sphere.getCircumference() + " units");
		System.out.println("The area of the sphere is: " + sphere.getArea() + " units squared");
		System.out.println("The volume of the sphere is: " + sphere.getVolume() + " units cubed");
		
		input.close();
	}
}
