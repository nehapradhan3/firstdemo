package first;
import java.util.*;

public class LinkedListDemo {
	public static void main (String[]args){
		//creating linked list
		LinkedList<String> l1= new LinkedList<String>();
		//add elements to the linked list
		l1.add("F");
		l1.add("B");
		l1.add("I");
		l1.addLast("Z");
		l1.addFirst("A");
		l1.add(1,"Ae");
		System.out.println("original content of L1"+l1);
		//removing elements from the linked list
		l1.remove("Ae");
		l1.remove(4);
		System.out.println("Content after deletion"+l1);
		//remove first and last
		l1.removeFirst();
		l1.removeLast();
		System.out.println("After deleting first and last element"+l1);
		//get and set a value
		Object val=l1.get(1);
		l1.set(1,(String)val+"\t changed");
		System.out.println("l1 after changed:"+l1);
		
		
		
		
		
	}

}
