package Account;

import java.util.Scanner;

import Operation.Operation;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Operation Op=new Operation();
		while(true)
		{
		System.out.println("Select the Option");
		
		System.out.println("1 Create an Account /n 2 Account Details /n 3 Account Balance /n 4 Deposite /n 5 Withdraw Amount");
		int x=sc.nextInt();
		switch(x)
		{
		case 1:
			Op.CreateAccount();
			break;
			
		case 2:
			Op.AccountDetails();
			break;
		
		case 3:
			Op.AccountBalance();
			break;
			
		case 4:
			Op.deposite();
			break;
			
		case 5:
			Op.Withdraw();
			
		}
	}
	}
}
