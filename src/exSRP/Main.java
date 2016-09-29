package exSRP;

public class Main {
	public static void main(String[] args) {
		
		Rect r1 = new Rect(2, 5);
		Rect r2 = new Rect(5, 4);
		
		Circle c1 = new Circle(10);
		
		Triangle t1 = new Triangle(2, 5);
		
		AreaSumCalculator asc = new AreaSumCalculator();
		AreaProdCalculator apc = new AreaProdCalculator();
		
		asc.addShape(r1);
		asc.addShape(r2);
		asc.addShape(c1);
		asc.addShape(t1);
		
		ConsolePrinter cp = new ConsolePrinter();
		
		cp.setAreaCalculator(asc);
		asc.calculate();
		cp.print();
	
		apc.addShape(r1);
		apc.addShape(r2);
		apc.addShape(c1);
		apc.addShape(t1);
		
		cp.setAreaCalculator(apc);
		apc.calculate();
		cp.print();
	}

}
