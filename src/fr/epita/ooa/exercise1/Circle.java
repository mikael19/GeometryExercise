package fr.epita.ooa.exercise1;

public class Circle implements Shape {

	//the way to define a constant : static final
	private static final double PI = 3.14159;

	//this is the radius of the circle
	private double radius;

	/**
	 * The constructor to create a circle with a radius equal to the given parameter
	 * @param r the radius of the circle to be created
	 */
	public Circle (double r){
		this.radius = r;
	}
	
	/**
	 * compute the area of the circle
	 * @return the area
	 */
	@Override
	public double getArea(){
		return PI * radius * radius;
	}

	/**
	 * compute the perimeter of the circle
	 * @return the perimeter
	 */
	@Override
	public double getPerimeter(){
		return 2 * PI * radius;
	}
}
