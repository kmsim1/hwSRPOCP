package exSRP;

public class ConsolePrinter {
	
	private AreaCalculator asc;
	
	public void setAreaCalculator(AreaCalculator ac) {
		this.asc = ac;
	}
	
	public void printSum() {
		System.out.println("������ �հ�� " + asc.getAreaSum());
	}
	
	
}
