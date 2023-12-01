package Operation;

import java.util.InputMismatchException;
import java.util.Scanner;

import Account.Amount;
import BankDetails.Account;

public class Operation {
Scanner Sc=new Scanner(System.in);
	Account Ac=new Account();
	
Amount am=new Amount();
	
	public void CreateAccount()
	{
	
	while(true) {
		while(true)
	{
			
		try {
			Scanner Sc1=new Scanner(System.in);
			System.out.println("Account Number");
			Ac.setAccountNumber(Sc1.nextInt());
			break;
			
		}
		catch(InputMismatchException e){
			System.out.println("Enter only Numbers");
			break;
		}
	}
		
		System.out.println("Enter Customer Name");
		Ac.setCustomerName(Sc.next());
		
		System.out.println("Enter Customer Address");
		Ac.setCustomerAddress(Sc.next());
		
		System.out.println("Enter Id Number");
		Ac.setIDNumber(Sc.next());
		
		
		System.out.println("Enter password \n use only digits");
		try {
		Ac.setPassword(Sc.nextInt());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter valide password");
			break;
		}
		while(true) {
			
		System.out.println("Enter Amount");
		
		double d=Sc.nextDouble();
		
		if(d>=500)	
		{
			Ac.setAmount(d);
			break;
		}
		else
		{
			System.out.println("Amount should be greater than 500");
			
		}
		
		}
		System.out.println("Account created successfully");
		break;
	}
	
	}
	
	public void deposite()
	{
		System.out.println("Enter Account Number");
		int AccountNumber=Sc.nextInt();
		
		if(Ac.getAccountNumber()==AccountNumber)
		{
			System.out.println("Varyfied");
			System.out.println("Enter Amount to Add");
			double  DepositedAmount=Sc.nextDouble();
			if(DepositedAmount>0)
			{
				double TotalAmount=Ac.getAmount()+DepositedAmount;
				Ac.setAmount(TotalAmount);
				System.out.println("Available Balance="+Ac.getAmount());
			}
		}
	}

	public void Withdraw()
	{
		
		if(Ac.getAccountNumber()==0)
		{
			System.out.println("First Create Your Account");
		}
		
		else
		{
			System.out.println("Enter Account Number");
			int y=Sc.nextInt();
			if(y==Ac.getAccountNumber())
			{
				System.out.println("Enter Amount to Withdraw");
				double x=Sc.nextDouble();
				if(x<=500)
				{
					System.out.println("Doesn't Withdraw");
				}
				else if(x>0)
					{
					double TotalAmount=Ac.getAmount()-x;
					Ac.setAmount(TotalAmount);
					
					System.out.println("Available Balance="+Ac.getAmount());
					}
					}
			System.out.println(" ");
		}
	}
	
	public void AccountBalance()
	{
		while(true)
		{
			System.out.println("Enter Account Number");
			try {
			int AccountNo=Sc.nextInt();
			if(Ac.getAccountNumber()==AccountNo)
			{
				System.out.println("Account Balance="+Ac.getAmount());
			break;
			}
				
			}catch(InputMismatchException e)
			{
				System.out.println("Please Enter Valide Account Number");
			}break;
		}
	}
	public void AccountDetails()
	{
		
		System.out.println(Ac.getAccountNumber());
		System.out.println(Ac.getCustomerName());
		System.out.println(Ac.getCustomerAddress());
		System.out.println(Ac.getIDNumber());
		System.out.println(Ac.getAmount());
		
	}
	

		
	}
   




