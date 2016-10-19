package first;
import java.util.*;
public class SetDemo{
	public static void main(String args[]){
		int count[]={1,1,22,3,4,55,67,899,234,234,45657,44444};
		Set <Integer> set= new HashSet<Integer>();
		try{
			for(int i=0;i<11;i++){
				set.add(count[i]);
			}
			System.out.println("the set is  "+set);
		
		TreeSet<Integer> sortedSet= new TreeSet<Integer>(set);
		System.out.println("the sorted set is"+sortedSet);
		System.out.println("the first element is  "+(Integer)sortedSet.first());
		System.out.println("the last element is  "+(Integer)sortedSet.last());
		}
		catch(Exception e){}
	}
}