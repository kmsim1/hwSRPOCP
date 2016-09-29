package exSRP;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AreaCalculator {
	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected double areacal;
	
	public void addShape(Shape s) {
		shapes.add(s);
	}
	
	public abstract void calculate();
	
	public double getAreaCal() {
		return areacal;
	}
}
