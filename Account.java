package banking;

import java.util.Random;

public class Account {
	String name;
	String accNo;
	double balance;
	
	public Account (String name,double balance,String accNo)
	{
		this.name=name;
		this.balance=balance;
		Random rand = new Random();
		String num ="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
		rand.nextInt(10)+ rand.nextInt(10);
        this.accNo=num;
        System.out.println("Account no  "+this.accNo);
		
	}
	public double displayBalance()
	{
		return this.balance;
	}
	public void deposit(double amt)
	{

		System.out.println("Balance after Deposit"+(this.balance=this.balance+amt));
	}
	
 

}
