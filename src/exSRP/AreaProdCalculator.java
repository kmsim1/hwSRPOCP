package exSRP;

import java.util.ArrayList;
import java.util.Iterator;

public class AreaProdCalculator extends AreaCalculator {
	
	@Override
	public void setOperand() {
		Iterator<Shape> it = shapes.iterator();

		while(it.hasNext()) {
			Shape curShape = it.next();
			areacal *= curShape.area();
		}
	}
	public void setAreacal() {
		this.areacal = 1.0;
	}
}
