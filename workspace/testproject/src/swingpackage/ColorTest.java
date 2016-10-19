package swingpackage;
import javax.swing.*;

public class ColorTest {
public static void main(String[] args) {
	JFrame f=new JFrame("title");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	First p=new First();
	f.add(p);
	f.setSize(400, 250);
	f.setVisible(true);;
}
}
