package ch06;

public class P124 {

	public static void main(String[] args) {
	
		// 원본 배열
		int[] arrInt = {1,2,3}
		
		// 복사할 배열
		int[] arrInt2 = new int [5];
		
		// 복사할 배열에 값 대입
		for (int i=0; i<arrInt.length; i++) {
			arrInt[i] = arrInt[i];
		}
		
		
	}

}
