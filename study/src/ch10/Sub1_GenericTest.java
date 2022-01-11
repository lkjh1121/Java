package ch10;

import ch09.Apple;
import ch09.Banana;

/**
 * ��¥ : 2022/01/11
 * �̸� : ������
 * ���� : �ڹ� ���׸� �ǽ��ϱ� ���� p384
 *
 */

public class Sub1_GenericTest {
	public static void main(String[] args) {
		
		Apple  apple  = new Apple("�ѱ�",3000);
		Banana banana = new Banana("�Ϻ�", 2000);

		FruitBox<Apple> box1 = new FruitBox<Apple>();
		FruitBox<Banana> box2 = new FruitBox<Banana>();
				
		box1.setFriut(apple);
		box2.setFriut(banana);
		
		box1.getFriut().toString();
		box2.getFriut().toString();
	}

}