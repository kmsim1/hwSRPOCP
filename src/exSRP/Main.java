package exSRP;

public class Main {
	public static void main(String[] args) {
		
		//도형을 ArrayList Shapes에 삽입.
		Rect r1 = new Rect(2, 5);
		Rect r2 = new Rect(5, 4);
		Circle c1 = new Circle(10);
		Triangle t1 = new Triangle(2, 5);
		
		//Calculator 객체 생성
		AreaSumCalculator asc = new AreaSumCalculator();
		AreaProdCalculator apc = new AreaProdCalculator();
		
		//ArrayList에 있는 도형들을 AreaSumCalculator에 집어넣는다.
		asc.addShape(r1);
		asc.addShape(r2);
		asc.addShape(c1);
		asc.addShape(t1);
		
		//연산의 결과를 출력하기 위한 ConsolePrinter 객체 생성
		ConsolePrinter cp = new ConsolePrinter();
		
		/*원하는 연산을 가지고 있는 
		 * Calculator를 가져와서 계산하여 출력한다*/
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
