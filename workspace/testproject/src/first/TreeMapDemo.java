package first;
import java.util.*;

public class TreeMapDemo {
public static void main(String[]args){
	//create a hash map
	TreeMap<String,Double> tm=new TreeMap<String, Double>();
	//add element to the hashMap
	tm.put("neha", new Double(3434.34));
	tm.put("neelam", new Double(3434.34));
	tm.put("nita", new Double(3434.34));
	tm.put("prajol", new Double(3434.34));
	tm.put("kebin", new Double(3434.34));
	//get a set of entries
	Set set=tm.entrySet();
	//Get an iterator
	Iterator i=set.iterator();
	//Display elements
	while(i.hasNext()){
		Map.Entry me=(Map.Entry)i.next();
		System.out.print(me.getKey()+":");
		System.out.println();
		//Deposit 1000 into Zara's account
		double balance=((Double)tm.get("Zara")).doubleValue();
		tm.put("Zara", new Double(balance+1000));
		System.out.println("Zara's new Double:"+tm.get("Zara"));
     	}
     }

	}
	
	
	