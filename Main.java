package banking;

import java.util.Scanner;

public class Main {

	/* String name;
	 double balance;*/

	public static void main(String[] args) 
	{
		int input;
		String accNo=null;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for Saving Account");
System.out.println("Enter 2 for Current Account");
input=sc.nextInt();
if(input==1)
{
	System.out.println("Enter Customer Name");
	String name = sc.next();
	System.out.println("Enter Initial Balance");
	double balance = sc.nextDouble();
	Saving s=new Saving(name,balance,accNo);

	System.out.println("Enter 1 for Deposit Money");
	System.out.println("Enter 2 for Withdraw Money");
	System.out.println("Enter 3 for Display Details");
	System.out.println("Enter 0 to Exit");
	
	int choice=sc.nextInt();
	if(choice==1) 
	{
	System.out.println("enter the Amount you want to Deposit");
	double amt=sc.nextInt();
	s.deposit(amt);
	System.out.println("Do you Want to Know the Balance before Deposit Yes/No ");
	String subChoice=sc.next();
	if(subChoice=="Yes") 
	{
		System.out.println("Balance :"+s.displayBalance());
	}
	}
	
	else if(choice==2) 
	{
	System.out.println("Enter the Amount you Want to Withdraw ");
	double amt=sc.nextDouble();
	s.withdraw(amt);
	}
	
	else if(choice==3) {}
	
	else {}
}

else if(input==2) 
{
	System.out.println("Enter Customer Name");
	String name = sc.next();
	System.out.println("Enter Initial Balance");
	double balance = sc.nextDouble();
	System.out.println("Enter Trade License No");
	int tradeLicenceNo=sc.nextInt();
	Current c=new Current(name,balance,accNo,tradeLicenceNo);
	int choice=sc.nextInt();
	System.out.println("Enter 1 for Deposit Money");
	System.out.println("Enter 2 for Withdraw Money");
	System.out.println("Enter 3 for Display Details");
	System.out.println("Enter 0 to Exit");
	
	 choice=sc.nextInt();
	if(choice==1) 
	{
	System.out.println("enter the Amount you want to Deposit");
	double amt=sc.nextInt();
	c.deposit(amt);
	System.out.println("Do you Want to Know the Balance before Deposit Yes/No ");
	String subChoice=sc.next();
	if(subChoice=="Yes") 
	{
		System.out.println("Balance :"+c.displayBalance());
	}
	else 
	{
	
	}
	
	}
	
	else if(choice==2) {}
	
	else if(choice==3) {}
	
	else {}	
}
else {

	System.out.println("Invalid Choice");
}
	}
	}

