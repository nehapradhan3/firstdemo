package lynda;

public class NumericWrapperClass {
	public static void main(String[] args) {
		double doublevalue=156.09d;
		Double doubleObject=new Double(doublevalue);
		byte byteValue=doubleObject.byteValue();
		System.out.println(byteValue);
		String stringValue=doubleObject.toString();
		System.out.println(stringValue);
		int intValue=doubleObject.intValue();
		System.out.println(intValue);
	}

}
