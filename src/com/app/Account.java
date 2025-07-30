package com.app;

public class Account  extends Bank{
	
	public Account() {
		super();
		System.out.println("Account constructor called here.........");
	}
	
	String accountHolderName;
	
	long accountNumber;
	
	String IFSC_CODE;
	
	double balance;

	public Account(String accountHolderName,long accountNumber,String IFSC_CODE,double balance)
	{
		
		super();
		
		System.out.println("Account ctor called here............");
		
		this.accountHolderName=accountHolderName;
		
		this.accountNumber=accountNumber;
		
		this.IFSC_CODE=IFSC_CODE;
		
		this.balance=balance;
	}
	
	public void Deposited_Money(double amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			
			System.out.println("Deposited Money Successfully here...... After Deposited Balance = "+balance);
		}
		else
		{
			System.out.println("Insufficient Balance Here..........");
		}
	}
	
	public void withDraw_Money(double amount)
	{
		if(amount>0)
		{
			if(amount<=balance)
			{
				balance=balance-amount;
				
				System.out.println("WithDraw Money successfully........After WithDraw Balance =  "+balance);
			}
			else
			{
				System.out.println("Insufficient balance here........");
			}
		}
		else
		{
			System.out.println("Invalid Balanace here....");
		}
	}
	
	public void Print_Details()
	{
		System.out.println("BankName = "+bankName);
		
		System.out.println("AccountHolderName= "+accountHolderName);
		
		System.out.println("IFSC_CODE = "+IFSC_CODE);
		
		System.out.println("Balance = "+balance);
	}
	
	

}
