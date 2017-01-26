package exercise5;

public class Square extends Rectangle {
double side;
	
		
	public Square(String color, double side) {
		super(color, side, side);
		this.side = side;
	
	}
	public double getPerimeter() {
	return 4*side;
	}

	public double getArea() {
	return side*side;

	}

	public void Solucion() {
		System.out.println("Square");
		System.out.println("Side: " + side);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
	}
