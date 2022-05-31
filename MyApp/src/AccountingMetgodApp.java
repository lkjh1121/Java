
public class AccountingMetgodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		print();
	}

	public static void print() {
		System.out.println("Value of supply : "+ valueOfSupply); // ���ް�
		System.out.println("VAT : "+ getVAT()); // �ΰ���ġ��
		System.out.println("Total : "+ getTotal()); // �ΰ���ġ��+���ް� �հ�
		System.out.println("Expense : "+ getExpense()); // ��� 30%
		System.out.println("Income : "+ getIncome()); // ���ް� - ���
		System.out.println("Dividend 1 : " + getDividend1());  // ��� ��ü���� ù��° ������ 5
		System.out.println("Dividend 2 : " + getDividend2());  // ��� ��ü���� �ι�° ������ 3
		System.out.println("Dividend 3 : " + getDividend3()); // ��� ��ü���� ����° ������ 2
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
