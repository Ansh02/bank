
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1
{
public static void main(String args[]) {
	
LinkedList<String> list=new LinkedList<String>();

list.add("One");
list.add("Two");
list.add("Three");
list.add("Four");
System.out.println(list);
/*list.add(123);*//* Compile time Error*/
Collections.sort(list);
System.out.println("listStrings after sorting: " + list);
list.remove("three");
list.remove("Three");
System.out.println("FInal LIst" + list);
}
	}
