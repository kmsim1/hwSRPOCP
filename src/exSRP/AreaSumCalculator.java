package exSRP;

import java.util.ArrayList;
import java.util.Iterator;

//Sum과 Prod 클래스 실행되는 부분은 같은데 초기화부분, 연산실행부분이 다름
//공통된 부분을 부모 클래스에 정의. 다른 부분을 자식클래스에 각자 정의를 해야함
//Template Method Design Pattern을 사용해서 예제 프로그램을 재구성해라.(과제)
//Report 1. tmdp의 일반적인 설명 2. 실제 적용 예

public class AreaSumCalculator extends AreaCalculator {
	
	public void calculate() {
		areasum = 0.0;
		Iterator<Shape> it = shapes.iterator();
		
		while(it.hasNext()) {
			Shape curShape = it.next();
			areasum += curShape.area();
		}
	}
	


}
