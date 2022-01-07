package ch05;
/**
 * ��¥ : 2022/01/05 
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� ���� p140
 */
public class Car {
	
	// �ڵ��� �Ӽ�
	public String name;
	public String color;
	public int speed;
	
	// ������
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	// �ڵ��� ���
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("======================");
		System.out.println("�ڵ��� �̸� : "+this.name);
		System.out.println("�ڵ��� ���� : "+this.color);
		System.out.println("�ڵ��� ����ӵ� : "+this.speed);
	}
}