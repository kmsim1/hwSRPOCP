package exSRP;

public class Circle extends Shape {

	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	@Override
	public double area() {
		return 3.14 * this.r * this.r;
	}
}
