package ch06;

/*
 * ��¥ : 2022/01/05 
 * �̸� : ������
 * ���� : �ڹ� Ŭ���� ��� �ǽ��ϱ� ���� p196
 */
public class Sub1_InheritanceTest {
		public static void main(String[] args) {
		
				StockAccount kb = new StockAccount("KB����",  "101-11-1012", "ȫ�浿", 10000, "�Ｚ����", 10, 700000);
		
				kb.deposit(1000000);
				kb.withdrew(20000);
				kb.show();
		
				kb.buy(10, 65000);
				kb.show();
		
				kb.sell(10, 72000);
				kb.show();
		}
}