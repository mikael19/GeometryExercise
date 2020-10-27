package fr.epita.ooa.exercise1;

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle smallCircle = new Circle(20);
		Circle bigCircle = new Circle(60);

		System.out.println("Small circle perimeter : " + smallCircle.getPerimeter() + "...");
		System.out.println("Big circle perimeter : " + bigCircle.getPerimeter() + "...");
		
		Triangle rightAngleTriangle = new Triangle(3, 4, 5, 0);
		Triangle equilateralTriangle = new Triangle(3, 4, 5, 5);

		System.out.println("Right angled triangle perimeter : " + rightAngleTriangle.getPerimeter() + "...");
		System.out.println("Equilateral triangle perimeter : " + equilateralTriangle.getPerimeter() + "...");
		
		Quadrilateral square = new Quadrilateral(20, 20);
		Quadrilateral rectangle = new Quadrilateral(60, 10);

		System.out.println("Square perimeter : " + square.getPerimeter() + "...");
		System.out.println("Rectangle perimeter : " + rectangle.getPerimeter() + "...");

	}

}