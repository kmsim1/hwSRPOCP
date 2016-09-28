package exSRP;

import java.util.ArrayList;
import java.util.Iterator;

public class AreaProdCalculator extends AreaCalculator {
	
	public void calculate() {
		areasum = 1.0;
		Iterator<Shape> it = shapes.iterator();
		
		while(it.hasNext()) {
			Shape curShape = it.next();
			areasum *= curShape.area();
		}
	}
}
