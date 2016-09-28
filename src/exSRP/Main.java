package exSRP;

public class Main {
	public static void main(String[] args) {
		
		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(100, 200);
		
		Circle c1 = new Circle(20);
		
		Triangle t1 = new Triangle(10, 20);
		
		AreaSumCalculator asc = new AreaSumCalculator();
		AreaProdCalculator apc = new AreaProdCalculator();
		asc.addShape(r1);
		asc.addShape(r2);
		asc.addShape(c1);
		asc.addShape(t1);
		
		asc.calculate();

		ConsolePrinter cp = new ConsolePrinter();
		cp.setAreaCalculator(asc);
		cp.printSum();
	}

}
