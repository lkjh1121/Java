package ch04;
/*
 * 날짜 : 2022/01/03
 * 이름 : 김재현
 * 내용 : OpEx1.java
 */
public class P53 {
	
	public static void main(String[] args) {
		
		int number1 = 10;
		System.out.println("number1 = 10 -> "+number1);  // 10출력
		
		number1 += 10; // 더하고 대입
		System.out.println("number1 += 10 -> "+number1);  // 20출력
		
		number1 -= 10; // 빼고 대입
		System.out.println("number1 *= 10 -> "+number1);  // 10출력
		
		number1 *= 2; // 곱하고 대입
		System.out.println("number1 *= 2 -> "+number1);  // 20출력
		
		number1 /= 2; // 나누고 대입
		System.out.println("number1 /= 2 -> "+number1);  // 10출력
		
		number1 %= 3; // 나머지 대입
		System.out.println("number1 %= 3 -> "+number1);  // 1출력
	}

}
