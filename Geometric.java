/*
2. Create an abstract class GeometricShape with abstract methods like area() and perimeter().
 Then, create concrete subclasses like Circle,Rectangle, and Triangle that inherit from 
 GeometricShape and implement the required methods.
 */

package Assignment6;

abstract class Geometric {
	abstract void area();

	abstract void perimeter();

}

class Circle extends Geometric {
	private final double PI = 3.14;
	private int r;

	public Circle(int r) {
		super();
		this.r = r;
	}

	void area() {
		System.out.println("Area of cirecle =" + (PI * r * r));

	}

	void perimeter() {
		System.out.println("Perimeter of circle =" + (2 * PI * r));

	}

}

class Rectangle extends Geometric {
	private int l;
	private int b;

	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	void area() {
		System.out.println("Area of rectangle =" + (l * b));

	}

	void perimeter() {
		System.out.println("Perimeter of rectangle =" + (2 * (l + b)));

	}

}

class Triangle extends Geometric {
	private int side1;
	private int side2;
	private int side3;
	private double result;

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	void area() {
		result = (side1 + side2 + side3) / 2;
		System.out.println("Area is =" + Math.sqrt((result * (result - side1) * (result - side2) * (result - side3))));

	}

	@Override
	void perimeter() {

		System.out.println("Perimeter of Triangle =" + (side1 + side2 + side3));

	}

}

public class GeometericShape {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		circle.area();
		circle.perimeter();
		System.out.println("====================");
		Rectangle rectangle = new Rectangle(5, 6);
		rectangle.area();
		rectangle.perimeter();
		System.out.println("=====================");
		Triangle triangle = new Triangle(5, 6, 7);
		triangle.area();
		triangle.perimeter();
	}

}