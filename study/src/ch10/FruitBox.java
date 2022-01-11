package ch10;

import ch09.Banana;
import ch09.Apple;

public class FruitBox<T> {
	
		private T fruit;
	
		// getter : 멤버변수(속성)를 외부에 제공하는 메서드
		public T getFriut() {
			return fruit;
		}
		
		//setter : 멤버변수 (속성)에 값을 외부에서 대입하는 메서드
		public void setFriut(T fruit) {
			this.fruit = fruit;
		}
}
