package first;
import java.util.*;
public class SortedSetTest{
	public static void main(String[]args){
		SortedSet<String> set= new TreeSet<String>();
		//add elements to the sorted set
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		//iterating over the elements
		Iterator<String> it= set.iterator();
		while(it.hasNext()){
			//get elements
			Object element=it.next();
			System.out.println(element.toString());
		}
	}
}