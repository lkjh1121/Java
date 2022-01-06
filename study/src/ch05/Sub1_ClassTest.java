package ch05;

/**
 * 날짜 : 2022/01/05 
 * 이름 : 김재현
 * 내용 : 자바 클래스 실습하기 교재 p140
 */
public class Sub1_ClassTest {

	public static void main(String[] args) {
		
		// Car객체 생성
		Car sonata = new Car();
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		sonata.speedUp(100);
		sonata.speedDown(60);
		sonata.show();
		
		// bmw 객체 생성
		Car bmw = new Car("520d", "남색", 0);
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		// Account 객체 생성
		Account bmw = new Account("
		
		// 객체 초기화
		bmw.name = "520d";
		bmw.color = "남색";
		bmw.speed = 0;
		
		
		bmw.speedUp(60);
		bmw.speedDown(10);
		bmw.show();
		
		// Account 객체 생성
		Account kb = new Account("국민은행", "101-12-1010", "김유신", 10000);
		
		
		kb.bank = "국민은행";
		kb.id = "101-12-1010";
		kb.name = "김유신";
		kb.balance = 10000;
		
		
		kb.deposit(40000);
		kb.withdrew(5000);
		
		// 참조변수로 객체의 변수를 직접 참조해서 취약점이 발생 <-- 캡슐
		kb.balance--;
		
		
		kb.show();
		
	
		
		Account wr = new Account("우리은행", "111-111-1012", "김춘추", 30000);
		wr.bank = "우리은행";
		wr.id = "111-111-1012";
		wr.name = "김춘추";
		wr.balance = 30000;
		
		wr.deposit(10000);
		wr.withdrew(12000);
		wr.show();
	}

}
