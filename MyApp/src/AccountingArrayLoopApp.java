
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;		
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;

		System.out.println("Value of supply : "+valueOfSupply); // ���ް�
		System.out.println("VAT : "+ vat ); // �ΰ���ġ��
		System.out.println("Total : "+ total ); // �ΰ���ġ��+���ް� �հ�
		System.out.println("Expense : "+ expense ); // ��� 30%
		System.out.println("Income : "+ income ); // ���ް� - ���

		double[] dividendRates = new double[3]; // ������ �����ͷ� �̷���� �迭�̴� 3���� ������ �ִ� ��������
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : "+ income*dividendRates[i] );  // ��ü���� ù��° ������ ��� 5
			i = i + 1;
		}
	}
}
