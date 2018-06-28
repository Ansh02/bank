package employee;

public class Employee {
	String empName;
	int id,age;
	
public 	Employee(int id,String empName,int age) 
{
this.id=id;
this.empName=empName;
this.age=age;
}
public String getName() {
    return empName;
}

public double getAge() {
    return age;
}



public int getId() {
    return id;
}

public void setName(String empName)
{
    this.empName = empName;
}

    public void setId(int id)
{
    this.id = id;
}

    public void setAge(int age)
{
    this.age = age;
}


    @Override
public String toString()
{
   
    return id+""+ empName +""+""+age;
}
}	


