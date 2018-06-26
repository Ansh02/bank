package banking;

public class Saving extends Account 
{
int interest =5;
double maxlimit=2000;
double minbal=500;
	public Saving(String name, double balance, String accNo) {
		super(name, balance, accNo);
		// TODO Auto-generated constructor stub
	}
public double getBalance()
{
	this.balance=this.balance+(this.balance*(interest/100));
	return this.balance;
	}
public void withdraw(double amt)
{
if(amt > this.maxlimit ) 
{
System.out.println("withdraw amount should be less than max limit ");	
}

else if((this.balance=this.balance-amt)<minbal)
{
	System.out.println("The User Should Maintain Atleast Minimum Balance");
	}
else 
System.out.println("Balance after withdraw"+(this.balance));
}

}