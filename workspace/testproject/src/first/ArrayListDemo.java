package first;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[]args){
		//create an arraylist
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("Initial size of a1:  "+a1.size());
		
		//adding elements to array list
		a1.add("C");
		a1.add("A");
		a1.add("B");
		a1.add("D");
		a1.add("F");
		a1.add(1,"A2");
		System.out.println("Size of a1 after adding elements\t"+a1.size());
		//Remove elements from the array list
		a1.remove("F");
		a1.remove(2);
		System.out.println("Size of ai after deletion\t"+a1.size());
		System.out.println("Content of a1 after deletion\t"+a1);

}
}