package second;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
	int option;
	System.out.println("Enter 1 for circle, 2 for square and 3 for triangle");
	Scanner scan=new Scanner(System.in);
	option=scan.nextInt();
	switch(option){
	case 1:
		Golo a=new Golo();
		a.goloMethod();
		break;
	case 2:
		Charpatey b=new Charpatey();
		b.charpateyMethod();
		break;
	case 3:
		Tricone c=new Tricone();
		c.triconeMethod();
		break;
		default:
			System.out.println("print either 1,2 or 3");
			break;
		
	}

}
}
