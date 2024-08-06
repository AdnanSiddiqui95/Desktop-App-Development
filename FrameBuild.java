import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameBuild 
{
	public FrameBuild()
	{
		JFrame frame=new JFrame("Frame");
		frame.setSize(600,400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JButton button1=new JButton("Submit");
		button1.setBounds(100, 200, 150, 30);
		frame.add(button1);
		
		JButton button2=new JButton("Cancel");
		button2.setBounds(300, 200, 150, 30);
		frame.add(button2);
	
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{	
		new FrameBuild();
	}
}
