package exercise5;

public abstract class Shape implements Measurable {
	String color;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
		
	}
	public abstract double getPerimeter();
	public abstract double getArea();

	public Shape(String color) {
		this.color = color;
	}
	public abstract void Solucion();
	
}
