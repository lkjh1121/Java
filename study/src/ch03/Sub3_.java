package ch03;
/*
 * ��¥ : 2022/01/04 
 * �̸� : ������
 * ���� : �ڹ� �ݺ��� while �ǽ��ϱ� ���� p92
 */

public class Sub3_ {
	// 1���� 10���� ��
	
	
	while��
		public static void main(String[] args) {
		
		System.out.println("1���� 10���� �� : "+sum);
		
		// do ~ while��
		int total = 0;
		int i = 1;
		
		do {
			if(i%2 == 0) {
				total += i;
			}
				
				i++;
	
		}while( i <= 10 );	
	
		System.out.println("1���� 10���� ¦���� : "+total);
		
		// break
		int num = 1;
		
		while(true) {
								
			if(num % 5 == 0 && num % 7 == 0) {
				break; // �ݺ���
			}
			
			num++;
		}
		
		System.out.println("5�� 7�� �ּҰ���� : "num);
		
		// continue
		int tot = 0;
		int j = 0;
		
		while( j <= 10) {
			
			j++;
			
			if( j%2 == 1 ) {
				continue; // �ݺ��� ó������ �̵�
			}
			tot += j;
		}
		
		System.out.println("1���� 10���� ¦���� : "+tot);
		
	}
	
}
