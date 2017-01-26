package exercise5;

public class Circle extends Shape {

	double radius;
	
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public void Solucion() {
		System.out.println("Rectangle");
		System.out.println("Radius: " + radius);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
}
