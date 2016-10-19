package second;

public class TernaryOp {
	public static void main(String[] args) {
		Object obj1;
		Object obj2;
		if (true){
			System.out.println(new Integer(10));
		          }
		else{
			System.out.println(new Double(15.5));
		     }
	
	
		obj2=true?new Integer(10):new Double(15.00);
		System.out.println(obj2);
		
}
}
