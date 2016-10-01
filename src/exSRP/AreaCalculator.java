package exSRP;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AreaCalculator {
	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected double areacal;
	
	public abstract void setAreacal();
	public abstract void setOperand();
	public final void calculate() {
		setAreacal();
		setOperand();
	}
	
	public void addShape(Shape s) {
		shapes.add(s);
	}
	public double getAreacal() {
		return areacal;
	}
}
