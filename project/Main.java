package bancking.project;

import java.util.Scanner;

public class Main {
public static void main(String[] args) throws InterruptedException {
	Scanner sc=new Scanner(System.in);
    Operation op=new Operation();
	while (true)
	{
		System.out.println("Welcome");
		Thread.sleep(2000);
		
	System.out.println("Select the option");
	
System.out.println(" 1.Create Account \n 2.Show Account details \n 3.Balance Check \n 4 Deposite \n 5 WithDraw");
int x=sc.nextInt();
switch(x) {
case 1:
	op.CreateAccount();
	break;
	
case 2:
	op.ShowAccountDetails();
	break;
	
case 3:
	op.BalanceCheck();
	break;
	
case 4:
	op.Deposite();
	break;
	
case 5:
	op.Withdraw();
	break;
}
}
}
}

