package ch05;
/**
 * ��¥ : 2022/01/05 
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ� ���� p140
 */
public class Car {
	
	// �ڵ��� �Ӽ�
	private String name;
	private String color;
	private int speed;

	// �ڵ��� ���
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	
	public void show() {
		System.out.println("============");
		System.out.println("�ڵ��� �̸� : "+this.name);
		System.out.println("�ڵ��� ���� : "+this.color);
		System.out.println("�ڵ��� ����ӵ� : "+this.speed);
	}
}
