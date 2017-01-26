package exercise5;

public class Rectangle extends Shape {

	double height;
	double width;
	
	public Rectangle(String color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	@Override
	public double getPerimeter() {
	return 2*height+2*width;
	}

	@Override
	public double getArea() {
	return height*width;

	}

	@Override
	public void Solucion() {
		System.out.println("Rectangle");
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
	
	
}
