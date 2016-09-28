package exSRP;

import java.util.ArrayList;
import java.util.Iterator;

//Sum�� Prod Ŭ���� ����Ǵ� �κ��� ������ �ʱ�ȭ�κ�, �������κ��� �ٸ�
//����� �κ��� �θ� Ŭ������ ����. �ٸ� �κ��� �ڽ�Ŭ������ ���� ���Ǹ� �ؾ���
//Template Method Design Pattern�� ����ؼ� ���� ���α׷��� �籸���ض�.(����)
//Report 1. tmdp�� �Ϲ����� ���� 2. ���� ���� ��

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
