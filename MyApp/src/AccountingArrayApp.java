
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;		
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;

		double[] dividendRates = new double[3]; // 더블형 데이터로 이루어진 배열이다 3개를 담을수 있는 수납상자
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		System.out.println("Value of supply : "+valueOfSupply); // 공급가
		System.out.println("VAT : "+ vat ); // 부가가치세
		System.out.println("Total : "+ total ); // 부가가치세+공급가 합계
		System.out.println("Expense : "+ expense ); // 비용 30%
		System.out.println("Income : "+ income ); // 공급가 - 비용
		System.out.println("Dividend 1 : "+ dividend1 );  // 전체수익 첫번째 투자자 배당 5
		System.out.println("Dividend 2 : "+ dividend2 );  // 전체수익 두번째 투자자 배당 3
		System.out.println("Dividend 3  : "+ dividend3 ); // 전체수익 세번째 투자자 배당 2
	}

}
