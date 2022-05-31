
public class AccountingIFApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;		
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if(income > 10000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		} else {
			dividend1 = income * 1;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}

		System.out.println("Value of supply : "+valueOfSupply); // ���ް�
		System.out.println("VAT : "+ vat ); // �ΰ���ġ��
		System.out.println("Total : "+ total ); // �ΰ���ġ��+���ް� �հ�
		System.out.println("Expense : "+ expense ); // ��� 30%
		System.out.println("Income : "+ income ); // ���ް� - ���
		System.out.println("Dividend 1 : "+ dividend1 );  // ��� ��ü���� ù��° ������ 5
		System.out.println("Dividend 2 : "+ dividend2 );  // ��� ��ü���� �ι�° ������ 3
		System.out.println("Dividend 3  : "+ dividend3 ); // ��� ��ü���� ����° ������ 2
	}

}
