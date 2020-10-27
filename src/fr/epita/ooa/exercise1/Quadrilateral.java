package fr.epita.ooa.exercise1;

public class Quadrilateral implements Shape {
	private double width = 0;
	private double height = 0;

	public Quadrilateral(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height * width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * height + width;
	}

}
