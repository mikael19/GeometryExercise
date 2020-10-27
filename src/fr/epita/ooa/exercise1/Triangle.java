package fr.epita.ooa.exercise1;

public class Triangle implements Shape {
	private double base = 0;
	private double height = 0;
	private double sideA = 0;
	private double sideB = 0;
	

	public Triangle(double base, double height, double sideA, double sideB) {
		super();
		this.base = base;
		this.height = height;
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return sideA + sideB + base;
	}

}
