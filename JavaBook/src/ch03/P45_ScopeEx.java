package ch03;
/*
 * 날짜 : 2021/12/31
 * 이름 : 김재현
 * 내용 : ScopeEx.Java
 */
public class P45_ScopeEx { // 1. 클래스 블럭

	private static String email;
	int no; // 1-1. 클래스 블럭 내에서 사용가능한 변수
	
	public static void main(String[] args) {  // 2. main 메서드 블럭
			
		String name; // 2. main 메서드 블럭 내에서 사용 가능한 변수
	
		if (true) {
			// 메서드 블럭 안에서 선언한변수 사용가능
			name = "홍길동";
		
			// it문 블럭안에서 변수 선언
			String email = "hong@test.com";			
		}
	
		// if문 블럭 밖에서 email 변수를 사용하면 에러 발생
		email = "hong@test.com";
	}
}
