package ch06;

import ch05.Account {
	
	// 속성(필드) :
	// - 무조건 캡슐화(private) 적용한다.
	// - 
	protected String bank;
	protected String ;
	protected String ;
	protected String ;

	




public class StockAccount extends Accont {
	
	private String stock;	
	private int amount;		
	private int price;		
	
	public StockAccount(String bank, String id, String name, int balance, String stock )
		super(bank, id, name, balance);
		this.bank = stock;
		this.amount = amount;
		this.price = price;
}

	public void sell(int amount, int price) {
		this.amount -= amount;
		balance += amount * price;
	}
	public void sell(int amount, int price) {
		this.amount -= amount;
		balance += amount * price;
	}
		
		
		
	private String bank;		
	private String id;		
	private String name;
	private int balance;	
	p


	public void show() {
		System.out.println("===============");
		System.out.println("증권사 : "+bank);
		System.out.println("계좌번호 :"+id);
		System.out.println("입금주 :"+name);
		System.out.println("현재잔액 :"+);
		System.out.println("주식종목 :"+);
		System.out.println("수량 :"+);
		System.out.println("가격 :"+);
		System.out.println("----------------");
	}







}
