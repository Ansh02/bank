package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList 
{
	 ArrayList<Employee> list = new ArrayList<Employee>();
	 public void addNewRecord()
	 {
		 
		  
		      Scanner sc = new Scanner(System.in);
	            System.out.println("enter the id");
	      
	            int id = sc.nextInt();

	            System.out.println("enter the Employee Name");
	            String empName = sc.next();

	            System.out.println("enter Employee age");
	            int age = sc.nextInt();

	            Employee emp = new Employee(id,empName,age);
	            list.add(emp);
	            System.out.println("Item Added");
		 }
		 
	 
	 public void displayAllList()
	 {
		 System.out.println( list.size()+ " emp ");
         for (Employee x : list) {
             System.out.println(x.toString());
	 }
	 
	 
	 }}
