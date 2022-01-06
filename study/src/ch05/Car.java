package ch05;
/**
 * 날짜 : 2022/01/05 
 * 이름 : 김재현
 * 내용 : 자바 클래스 실습하기 교재 p140
 */
public class Car {
	
	// 자동차 속성
	private String name;
	private String color;
	private int speed;

	// 자동차 기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	
	public void show() {
		System.out.println("============");
		System.out.println("자동차 이름 : "+this.name);
		System.out.println("자동차 색상 : "+this.color);
		System.out.println("자동차 현재속도 : "+this.speed);
	}
}
