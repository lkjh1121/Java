
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
		System.out.println("Value of supply : "+ valueOfSupply); // 공급가
		System.out.println("VAT : "+ getVAT()); // 부가가치세
		System.out.println("Total : "+ getTotal()); // 부가가치세+공급가 합계
		System.out.println("Expense : "+ getExpense()); // 비용 30%
		System.out.println("Income : "+ getIncome()); // 공급가 - 비용
		System.out.println("Dividend 1 : " + getDividend1());  // 배당 전체수익 첫번째 투자자 5
		System.out.println("Dividend 2 : " + getDividend2());  // 배당 전체수익 두번째 투자자 3
		System.out.println("Dividend 3 : " + getDividend3()); // 배당 전체수익 세번째 투자자 2
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
