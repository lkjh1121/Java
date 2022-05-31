
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;		
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;

		double[] dividendRates = new double[3]; // ������ �����ͷ� �̷���� �迭�̴� 3���� ������ �ִ� ��������
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		System.out.println("Value of supply : "+valueOfSupply); // ���ް�
		System.out.println("VAT : "+ vat ); // �ΰ���ġ��
		System.out.println("Total : "+ total ); // �ΰ���ġ��+���ް� �հ�
		System.out.println("Expense : "+ expense ); // ��� 30%
		System.out.println("Income : "+ income ); // ���ް� - ���
		System.out.println("Dividend 1 : "+ dividend1 );  // ��ü���� ù��° ������ ��� 5
		System.out.println("Dividend 2 : "+ dividend2 );  // ��ü���� �ι�° ������ ��� 3
		System.out.println("Dividend 3  : "+ dividend3 ); // ��ü���� ����° ������ ��� 2
	}

}
