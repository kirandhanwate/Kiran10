package bancking.project;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Operation {
	
SessionFactory sf=Hibernate_Util.getSessionFactory();

Account ac=new Account();

Transaction t=new Transaction();
private List list;

public void CreateAccount() {
	Session session=sf.openSession();
	Scanner sc=new Scanner(System.in);
	while(true) {
		
		System.out.println("Enter Account Holder Name");
		ac.setAccount_Holder_name(sc.next());
		
		System.out.println("Enter Permanant Address");
		ac.setAccount_Holder_Address(sc.next());
		
		System.out.println("Enter Mobile Number");
		ac.setMobile_Number(sc.next());
		try {
		System.out.println("Enter Password");
		ac.setPassword(sc.next());
		}catch(NumberFormatException e) {
			System.out.println("Enter only Digits");
			
		}
		System.out.println("Enter the Amount");
		double d=sc.nextDouble();
		if(d>=500) {
			ac.setAmount(d);
			
		}else {
			System.out.println("Amount must be greater than 500");
			break;
		}
		
		System.out.println("Account created successfully");
		
		session.save(ac);
		session.beginTransaction().commit();
		session.close();
		sf.close();
break;
	}
   }
    public void ShowAccountDetails() 
    {
    	Session session=sf.openSession();
    	while(true) {
    	Scanner sc2=new Scanner(System.in);
    	System.out.println("Enter account number");
    	int x=sc2.nextInt();
    	
    	Account ab=session.get(Account.class, x);
    	if(ab.getAccount_Number()==x)
    	{
    		
    		
	System.out.println(ab.getAccount_Number());
	System.out.println(ab.getAccount_Holder_name());
	System.out.println(ab.getAccount_Holder_Address());
	System.out.println(ab.getMobile_Number());
	System.out.println(ab.getAmount());
    		
    	}
    	else {
    		System.out.println("Enter correct Account number");
    		
    	}
	session.close();
	
	break;
    }
    }
    public void BalanceCheck() 
    {
    	Session session=sf.openSession();
    	
    	while(true) {
    	Scanner sc3=new Scanner(System.in);
    	System.out.println("Enter account number");
    	int y=sc3.nextInt();
    	
    	Account a=session.get(Account.class, y);
    	if(a.getAccount_Number()==y) {
 
           System.out.println(a.getAmount());
    	}
    	else {
    		System.out.println("Enter correct Account number");
    		break;
    	}
    	session.close();
    	break;
    }
    }
    public void Deposite()
    {
    	Session session=sf.openSession();
    	
    	while(true) {
    	Scanner sc1=new Scanner(System.in);
    	System.out.println("Enter account number");
    	int z=sc1.nextInt();
    	
    	Account ab=session.get(Account.class,z);
    	if(ab.getAccount_Number()==z)
    	{
    	System.out.println("Enter the amount to add");
    	double a=sc1.nextDouble();
    	    t.setDebited_Amount(a);
    	    t.setAccount(ab);
    	double total=a+ab.getAmount();
    	ab.setAmount(total);
    	
    	}
    	else {
    		System.out.println("Enter correct Account number");	
    	}
    	
    	System.out.println("Deposited successfully");
    	
    	session.save(ab);
    	session.save(t);
    	session.beginTransaction().commit();
    	session.close();
    	
    	break;
    	}
    }
    public void Withdraw()
    {
    	Session session=sf.openSession();
    	while(true) {
    	Scanner sc1=new Scanner(System.in);
    	System.out.println("Enter account number");
    	int w=sc1.nextInt();
    	
    	Account ab=session.get(Account.class,w);
    	if(ab.getAccount_Number()==w)
    	{
    	System.out.println("Enter the amount to Withdraw");
    	double a=sc1.nextDouble();
    	t.setWithdraw_Amount(a);
    	t.setAccount(ab);
    	double total=ab.getAmount()-a;
    	ab.setAmount(total);
    	}
    	else {
    		System.out.println("Enter correct Account number");
    		
    	}
    	System.out.println("Withdraw successfully");
    	session.save(ab);
    	session.save(t);
    	session.beginTransaction().commit();
    	session.close();
    	
    	break;
    }
    	sf.close();
    }
    

}
