package ch03;

/*
 * 날짜 : 2021/12/31
 * 이름 : 김재현
 * 내용 : CharType.Java P40
 */

public class P40_CharType {
	
	public static void main(String[] args) {
		
		char a = 'A';
		
		System.out.println("a:"+a);
		
		int b = a;
		System.out.println("b:"+b);
		
		char c = 66 ; //에러
		System.out.println("c:"+c);
		
		int d = a+b; // 65 + 65
		System.out.println("d:"+d);
		
	}

}
