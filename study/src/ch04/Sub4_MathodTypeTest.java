package ch04;

import java.security.PublicKey;

/*
 * ��¥ : 2022/01/04 
 * �̸� : ������
 * ���� : �ڹ� �޼���Ÿ�� �ǽ��ϱ� ���� p155
 *
 */
public class Sub4_MathodTypeTest {
	
	// main �޼��� : �ڹ� ���α׷��� �����Լ� (���� ������)
	public static void main(String[] args) {
		
		double y1 = type1(0.1);
		double y2 = type1(1.2);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		
		// type2 ȣ��
		type2(true);
		type2(false);
		
		
		// type3 ȣ��
		String result = type3();
		System.out.println("result : "+result);
	
		// type4 ȣ��
	}
	
	// type1 : �Ű����� O, ���ϰ� O
	public static double type1(double x) {
	
	
	// type2 : �Ű����� O, ���ϰ� X
	
	
	
	
	
	
		// type3 : �Ű����� X, ���ϰ� O
		public static String type3() {

			int n1 = 1;
			int n2 = 2;
			
			if(n1 > n2) {
				return "n1�� n2���� ũ��.";
			}else {
				return "n1�� n2���� �۴�.";
			}
			
			
		// type4 : �Ű�����X, ���ϰ�X
		publec static void type4() {
			double result = type1(10.01);
			
		
		
		
	}
	
	// type1 : �Ű����� O, ���ϰ� O
	public static double type1(double x) {
		double y = X + 3.14;
		return y;
	}
	// type2 : �Ű����� O, ���ϰ� x
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("�� �Դϴ�.");
		}else {	
			System.out.println("�� �Դϴ�.");
		
		}
	}
	
	// type3 : �Ű����� x, ���ϰ� O
	public static String type3() {

		int n1 = 1;
		int n2 = 2;
		
		if(n1 > n2) {
			return "n1�� n2���� ũ��.";
		}else {
			return "n1�� n2���� �۴�.";
		}
	
	// type4 : �Ű�����X, ���ϰ�X
		publec static void type4() {
			double result = type1(10.01);
			
	}
}