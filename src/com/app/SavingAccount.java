package com.app;

public class SavingAccount extends Account  {
	
	double interstRate;
	
	public SavingAccount() {
		super();
		System.out.println("SavingAccount ctor called here............");
	}
	
	SavingAccount(String accountHolderName,long accountNumber,String IFSC_CODE,double balance,double interstRate)
	{
		super(accountHolderName,accountNumber,IFSC_CODE,balance);
		System.out.println("SavingAccount ctor called here............");
		this.interstRate=interstRate;
	}
	
	public void calculated_InterestRate(int Years)
	{
		double interest = balance * interstRate * Years/100;
		System.out.println("Interst = " +interest);
	}
	
	public static void main(String[] args) {
		
		SavingAccount ss = new SavingAccount("Ram", 1234567L, "7654321", 50000.00, 4.3);
		
		ss.Deposited_Money(2000.00);
		
		ss.withDraw_Money(1000.00);
		
		ss.Print_Details();
		
		ss.calculated_InterestRate(2);
		
		System.out.println("============================================");
		
      SavingAccount ss1 = new SavingAccount("Shyam", 123457891L, "7651239", 70000.00, 4.3);
		
		ss1.Deposited_Money(5000.00);
		
		ss1.withDraw_Money(2000.00);
		
		ss1.Print_Details();
		
		ss1.calculated_InterestRate(3);
		
	}
}
