package first;
import java.util.*;

public class CollectionDemo {
public static void main(String []args){
	ArrayList<String> a1= new ArrayList<String>();
	a1.add("Zara");
	a1.add("Ravi");
	a1.add("Ravi");
	a1.add("Ravi");
	a1.add("Apple");
	System.out.println("ArraryList Elements");
	System.out.println("\t"+a1);
   LinkedList<String> l1=new LinkedList<String>();
   l1.add("zara");
   l1.addFirst("neha");
   l1.addLast("neha");
   l1.add("neha");
   //l1.addAll(l1);
   System.out.println("LinkedList elements\n"+l1);
   
	
}
}
