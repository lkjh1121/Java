package ch10;

import ch09.Banana;
import ch09.Apple;

public class FruitBox<T> {
	
		private T fruit;
	
		// getter : �������(�Ӽ�)�� �ܺο� �����ϴ� �޼���
		public T getFriut() {
			return fruit;
		}
		
		//setter : ������� (�Ӽ�)�� ���� �ܺο��� �����ϴ� �޼���
		public void setFriut(T fruit) {
			this.fruit = fruit;
		}
}
