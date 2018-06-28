package employee;

import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		EmployeeList e = new EmployeeList();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 1 for adding new record ");
		System.out.println("enter 2 to All Display Records");
		System.out.println("enter 3 to Exit ");
		int choice=sc.nextInt();
		while(choice!=3)
		if(choice==1)
		{
			e.addNewRecord();
		}
		if(choice==2) 
		{
			e.displayAllList();
		}
		
		
	}
	
}