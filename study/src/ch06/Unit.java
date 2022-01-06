package ch06;

public abstract class Unit {
	
	
	public void move() {
		System.out.println("Unit move...");
	}
	
	// 추상메서드
	public abstract void attack(); 
}
