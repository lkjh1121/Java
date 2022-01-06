package ch05;
/**
 * 날짜 : 2022/01/05 
 * 이름 : 김재현
 * 내용 : 자바 클래스 실습하기 교재 p140
 */

public class Increment {
	
	public int num1;
	public static int num2;
	
	public Increment() {
		
		num1++;
		num2++;
		
		System.out.println("Increment num1 : "+num1);
		System.out.println("Increment num2 : "+num2);
	}
	
	// 정적메서드에서는 non-static 변수를 참조할 수 없다.
	public static void add() {
		//num1++;
		num2++;
		
	}

}
