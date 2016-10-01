package exSRP;

import java.util.Iterator;

public class AreaSumCalculator extends AreaCalculator {
	
	@Override
	public void setOperand() {
		Iterator<Shape> it = shapes.iterator();

		while(it.hasNext()) {
			Shape curShape = it.next();
			areacal += curShape.area();
		}
	}
	public void setAreacal() {
		this.areacal = 0.0;
	}
}
