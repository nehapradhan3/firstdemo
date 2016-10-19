import java.util.Scanner;
class InstanceVariableTest {
	public static void main(String[] args) {
		Scanner hello=new Scanner(System.in);
		Orange farci=new Orange();
		System.out.println("Enter your favourite fruit ");
		String apple;
		apple=hello.nextLine();
		farci.setName(apple);
		farci.sayings();
		
		
	}

}
