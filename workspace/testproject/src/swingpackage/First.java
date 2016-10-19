package swingpackage;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class First extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.GRAY);
		g.setColor(Color.BLUE);
		g.fillRect(15, 15, 100, 100);
		g.setColor(new Color(130,60,50));
		g.fillRect(15, 150, 100, 100);
		g.setColor(Color.RED);
		g.drawString("Hello !!how are you",15,290);
	}
	
	

}
