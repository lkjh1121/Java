package ch04;

import java.security.PublicKey;

/*
 * 날짜 : 2022/01/04 
 * 이름 : 김재현
 * 내용 : 자바 메서드타입 실습하기 교재 p155
 *
 */
public class Sub4_MathodTypeTest {
	
	// main 메서드 : 자바 프로그램의 실행함수 (최초 진입점)
	public static void main(String[] args) {
		
		double y1 = type1(0.1);
		double y2 = type1(1.2);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		
		// type2 호출
		type2(true);
		type2(false);
		
		
		// type3 호출
		String result = type3();
		System.out.println("result : "+result);
	
		// type4 호출
	}
	
	// type1 : 매개변수 O, 리턴값 O
	public static double type1(double x) {
	
	
	// type2 : 매개변수 O, 리턴값 X
	
	
	
	
	
	
		// type3 : 매개변수 X, 리턴값 O
		public static String type3() {

			int n1 = 1;
			int n2 = 2;
			
			if(n1 > n2) {
				return "n1은 n2보다 크다.";
			}else {
				return "n1은 n2보다 작다.";
			}
			
			
		// type4 : 매개변수X, 리턴값X
		publec static void type4() {
			double result = type1(10.01);
			
		
		
		
	}
	
	// type1 : 매개변수 O, 리턴값 O
	public static double type1(double x) {
		double y = X + 3.14;
		return y;
	}
	// type2 : 매개변수 O, 리턴값 x
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("참 입니다.");
		}else {	
			System.out.println("참 입니다.");
		
		}
	}
	
	// type3 : 매개변수 x, 리턴값 O
	public static String type3() {

		int n1 = 1;
		int n2 = 2;
		
		if(n1 > n2) {
			return "n1은 n2보다 크다.";
		}else {
			return "n1은 n2보다 작다.";
		}
	
	// type4 : 매개변수X, 리턴값X
		publec static void type4() {
			double result = type1(10.01);
			
	}
}
