package banking;

public class Current extends Account 
{
	int tradeLicenceNo;

	public Current(String name, double balance, String accNo,int tradeLicenceNo) {
		super(name, balance, accNo);
		// TODO Auto-generated constructor stub
		this.tradeLicenceNo=tradeLicenceNo;
	}
public double getBalance(double balance)
{
return this.balance;
}
	public void withdraw(double amt)
	{
		if(this.balance < amt)
			{
			System.out.println("transaction not Possible");
			}
		else
		{
			
			System.out.println("Balance after withdraw"+(this.balance=this.balance-amt));
		}
	}
}
